LarryCurlyMoe
=============
Multiprocessor Synchronization:
Larry, Moe, and Curly are planting tulip bulbs. Larry digs the holes. Moe then places a bulb in each hole. Curly then fills the hole up.
There are several synchronization constraints:
• Moe cannot plant a bulb unless at least one empty hole exists, but Moe does not care how far Larry gets ahead of Moe.
• Curly cannot fill a hole unless at least one hole exists in which Moe has planted a bulb, but the hole has not yet been filled. Curly does not care how far Moe gets
ahead of Curly.
• Curly does care that Larry does not get more than MAX holes ahead of Curly. Thus, if there are MAX unfilled holes, Larry has to wait.
• There is only one shovel with which both Larry and Curly need to dig and fill the holes, respectively.
Design, implement and test a solution for this IPC problem, which represent Larry, Curly, and Moe.
