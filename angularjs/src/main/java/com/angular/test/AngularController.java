package com.angular.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AngularController {

	/*
	 * GET method
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		System.out.println("Get method Invoked");
		String result = "{\"status\":\"success\",\"errorMessage\":null,\"object\":[{\"id\":\"H049\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R049\",\"residentName\":\"Tan Keow Eng \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#12-226\",\"block\":\"Blk 6\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440006\"},\"objectList\":[{\"objectId\":\"S217\",\"name\":\"H049_Bath_Room_49\"},{\"objectId\":\"S218\",\"name\":\"H049_Reading_Room_49\"},{\"objectId\":\"S219\",\"name\":\"H049_Bed_Room_49\"},{\"objectId\":\"S220\",\"name\":\"H049_Door_Contact_49\"},{\"objectId\":\"S221\",\"name\":\"H049_Kitchen_49\"},{\"objectId\":\"S222\",\"name\":\"H049_Living_Room_49\"},{\"objectId\":\"S262\",\"name\":\"H049_Toilet_49\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA143\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U003\",\"name\":\"GL2\"},{\"id\":\"U002\",\"name\":\"GL1\"}],\"activityLastSeen\":\"31-01-2017 14:01:20\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:05:08\"},{\"id\":\"H050\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R050\",\"residentName\":\"Lee Norma Heather \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#10-153\",\"block\":\"Blk 31\",\"street\":\"Marine Crescent\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440031\"},\"objectList\":[{\"objectId\":\"S223\",\"name\":\"H050_Bath_Room_50\"},{\"objectId\":\"S224\",\"name\":\"H050_Bed_Room_50\"},{\"objectId\":\"S225\",\"name\":\"H050_Door_Contact_50\"},{\"objectId\":\"S226\",\"name\":\"H050_Kitchen_50\"},{\"objectId\":\"S227\",\"name\":\"H050_Living_Room_50\"},{\"objectId\":\"S263\",\"name\":\"H050_Toilet_50\"},{\"objectId\":\"S286\",\"name\":\"H050_Spare_Room_50\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA142\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 10:18:07\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:04:56\"},{\"id\":\"H052\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R052\",\"residentName\":\"Fatimah Binte Abdul Kadir \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#06-205\",\"block\":\"Blk 52\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440052\"},\"objectList\":[{\"objectId\":\"S270\",\"name\":\"H052_Bathroom_52\"},{\"objectId\":\"S271\",\"name\":\"H052_Bed_Area_52\"},{\"objectId\":\"S272\",\"name\":\"H052_Door_Contact_52\"},{\"objectId\":\"S273\",\"name\":\"H052_Kitchen_52\"},{\"objectId\":\"S274\",\"name\":\"H052_Living_Room_52\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA116\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U003\",\"name\":\"GL2\"},{\"id\":\"U002\",\"name\":\"GL1\"}],\"activityLastSeen\":\"31-01-2017 14:18:35\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:00:30\"},{\"id\":\"H053\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R053\",\"residentName\":\"Ko Oh Toh \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#05-193\",\"block\":\"Blk 52\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440052\"},\"objectList\":[{\"objectId\":\"S275\",\"name\":\"H053_Bathroom_53\"},{\"objectId\":\"S276\",\"name\":\"H053_Bed_Area_53\"},{\"objectId\":\"S277\",\"name\":\"H053_Door_Contact_53\"},{\"objectId\":\"S278\",\"name\":\"H053_Kitchen_53\"},{\"objectId\":\"S279\",\"name\":\"H053_Living_Room_53\"},{\"objectId\":\"S280\",\"name\":\"H053_Alert_53\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA117\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U003\",\"name\":\"GL2\"},{\"id\":\"U002\",\"name\":\"GL1\"}],\"activityLastSeen\":\"31-01-2017 14:20:29\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:00:36\"},{\"id\":\"H054\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R054\",\"residentName\":\"Chng Chin Huat \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#10-209\",\"block\":\"Blk 52\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440052\"},\"objectList\":[{\"objectId\":\"S281\",\"name\":\"H054_Bathroom_54\"},{\"objectId\":\"S282\",\"name\":\"H054_Bed_Area_54\"},{\"objectId\":\"S283\",\"name\":\"H054_Door_Contact_54\"},{\"objectId\":\"S284\",\"name\":\"H054_Kitchen_54\"},{\"objectId\":\"S285\",\"name\":\"H054_Living_Room_54\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA118\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U003\",\"name\":\"GL2\"},{\"id\":\"U002\",\"name\":\"GL1\"}],\"activityLastSeen\":\"31-01-2017 14:32:08\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:00:46\"},{\"id\":\"H018\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R018\",\"residentName\":\"Loh Su Tong \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#12-221\",\"block\":\"Blk 53\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440053\"},\"objectList\":[{\"objectId\":\"S087\",\"name\":\"H018_Bathroom_18\"},{\"objectId\":\"S088\",\"name\":\"H018_Bed_Area_18\"},{\"objectId\":\"S089\",\"name\":\"H018_Door_Contact_18\"},{\"objectId\":\"S090\",\"name\":\"H018_Kitchen_18\"},{\"objectId\":\"S091\",\"name\":\"H018_Living_Room_18\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA130\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":\"test\",\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 13:55:15\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:02:33\"},{\"id\":\"H019\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R019\",\"residentName\":\"Choo Hwee Kiang \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#11-219\",\"block\":\"Blk 53\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440053\"},\"objectList\":[{\"objectId\":\"S092\",\"name\":\"H019_Bathroom_19\"},{\"objectId\":\"S093\",\"name\":\"H019_Bed_Area_19\"},{\"objectId\":\"S094\",\"name\":\"H019_Door_Contact_19\"},{\"objectId\":\"S095\",\"name\":\"H019_Kitchen_19\"},{\"objectId\":\"S096\",\"name\":\"H019_Living_Room_19\"},{\"objectId\":\"S253\",\"name\":\"H019_Alert_19\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA131\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 14:44:27\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:02:43\"},{\"id\":\"H020\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R020\",\"residentName\":\"Ang Sock Cheng \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#16-225\",\"block\":\"Blk 53\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440053\"},\"objectList\":[{\"objectId\":\"S097\",\"name\":\"H020_Bathroom_20\"},{\"objectId\":\"S098\",\"name\":\"H020_Bed_Area_20\"},{\"objectId\":\"S099\",\"name\":\"H020_Door_Contact_20\"},{\"objectId\":\"S100\",\"name\":\"H020_Kitchen_20\"},{\"objectId\":\"S101\",\"name\":\"H020_Living_Room_20\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA132\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"27-01-2017 17:28:09\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:02:51\"},{\"id\":\"H021\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R021\",\"residentName\":\"Catherine Khor Mun Huean \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#09-12\",\"block\":\"Blk 15\",\"street\":\"Marine Terrace\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440015\"},\"objectList\":[{\"objectId\":\"S102\",\"name\":\"H021_Bathroom_21\"},{\"objectId\":\"S103\",\"name\":\"H021_Bed_Area_21\"},{\"objectId\":\"S104\",\"name\":\"H021_Door_Contact_21\"},{\"objectId\":\"S105\",\"name\":\"H021_Kitchen_21\"},{\"objectId\":\"S106\",\"name\":\"H021_Living_Room_21\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA106\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U003\",\"name\":\"GL2\"},{\"id\":\"U002\",\"name\":\"GL1\"}],\"activityLastSeen\":\"31-01-2017 14:03:49\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 13:59:12\"}]}";
		return result;
	}

	/*
	 * POST method
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String create(@RequestBody Home object) {
		System.out.println("Post method Invoked");
		String result = "{\"id\":\"H050\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R050\",\"residentName\":\"Lee Norma Heather \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#10-153\",\"block\":\"Blk 31\",\"street\":\"Marine Crescent\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440031\"},\"objectList\":[{\"objectId\":\"S223\",\"name\":\"H050_Bath_Room_50\"},{\"objectId\":\"S224\",\"name\":\"H050_Bed_Room_50\"},{\"objectId\":\"S225\",\"name\":\"H050_Door_Contact_50\"},{\"objectId\":\"S226\",\"name\":\"H050_Kitchen_50\"},{\"objectId\":\"S227\",\"name\":\"H050_Living_Room_50\"},{\"objectId\":\"S263\",\"name\":\"H050_Toilet_50\"},{\"objectId\":\"S286\",\"name\":\"H050_Spare_Room_50\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA142\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 10:18:07\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:04:56\"}";
		return result;
	}

	/*
	 * DELETE method
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	public String delete(@RequestParam String query) {
		System.out.println("Delete method Invoked");
		String result = "{\"id\":\"H050\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R050\",\"residentName\":\"Lee Norma Heather \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#10-153\",\"block\":\"Blk 31\",\"street\":\"Marine Crescent\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440031\"},\"objectList\":[{\"objectId\":\"S223\",\"name\":\"H050_Bath_Room_50\"},{\"objectId\":\"S224\",\"name\":\"H050_Bed_Room_50\"},{\"objectId\":\"S225\",\"name\":\"H050_Door_Contact_50\"},{\"objectId\":\"S226\",\"name\":\"H050_Kitchen_50\"},{\"objectId\":\"S227\",\"name\":\"H050_Living_Room_50\"},{\"objectId\":\"S263\",\"name\":\"H050_Toilet_50\"},{\"objectId\":\"S286\",\"name\":\"H050_Spare_Room_50\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA142\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 10:18:07\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:04:56\"}";
		return result;
	}

	/*
	 * PUT method
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public String updateAlertRule(@RequestBody Home object) {
		System.out.println("Update method Invoked");
		String result = "{\"id\":\"H050\",\"buildingType\":\"HOUSE\",\"occupiedStatus\":\"occupied\",\"residentList\":[{\"residentId\":\"R050\",\"residentName\":\"Lee Norma Heather \",\"residentContactNumber\":null}],\"activeState\":\"true\",\"address\":{\"unitNo\":\"#10-153\",\"block\":\"Blk 31\",\"street\":\"Marine Crescent\",\"city\":null,\"country\":\"Singapore\",\"postalCode\":\"440031\"},\"objectList\":[{\"objectId\":\"S223\",\"name\":\"H050_Bath_Room_50\"},{\"objectId\":\"S224\",\"name\":\"H050_Bed_Room_50\"},{\"objectId\":\"S225\",\"name\":\"H050_Door_Contact_50\"},{\"objectId\":\"S226\",\"name\":\"H050_Kitchen_50\"},{\"objectId\":\"S227\",\"name\":\"H050_Living_Room_50\"},{\"objectId\":\"S263\",\"name\":\"H050_Toilet_50\"},{\"objectId\":\"S286\",\"name\":\"H050_Spare_Room_50\"}],\"alertRuleList\":[{\"alertRuleId\":\"L001\",\"alertRuleName\":\"Inactivity - 1h\",\"alertRuleAssociationId\":\"LA142\",\"templateSource\":2}],\"alertEnableStatus\":\"true\",\"remarks\":null,\"caregivers\":[{\"id\":\"U002\",\"name\":\"GL1\"},{\"id\":\"U003\",\"name\":\"GL2\"}],\"activityLastSeen\":\"31-01-2017 10:18:07\",\"createdBy\":\"U001\",\"createdOn\":\"01/07/2016 10:05:43\",\"updatedBy\":\"U001\",\"updatedOn\":\"31-01-2017 14:04:56\"}";
		return result;
	}
}
