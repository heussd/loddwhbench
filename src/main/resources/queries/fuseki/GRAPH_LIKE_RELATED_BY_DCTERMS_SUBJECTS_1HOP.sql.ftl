select ?orig_id ?orig_subj ?related_id
where
{  
	?s1 <http://purl.org/dc/terms/identifier> ?orig_id .   
	?s1 <http://purl.org/dc/terms/subject> ?orig_subj .   
	?s2 <http://purl.org/dc/terms/identifier> ?related_id .   
	?s2 <http://purl.org/dc/terms/subject> ?orig_subj .   
	filter( ?orig_id != ?related_id )
	filter( ?orig_id in (##ids##) )
}	
