[Model]
MFP=Samsung
PrinterRegKeyName = Samsung SCX-4300 Series

[Support]
isSupportSM = 1
isSMSupportUSB =1  
isSMSupportNetwork = 1  
isSupportDeviceMonitor = 1
isSupportGdiRta = 1
isSupportPJL = 1
isForSmartPanel = 1

[Registry]
SMPath = SOFTWARE\SPanel

[Network]
Count = 2
Monitor1 = Samsung Network Printer Port
Monitor2 = TCPMON.DLL

[DevMon]
FileName = ssdevm.dll
isDevmonSupportUSB = 1
isDevmonSupportLPT = 1

[GDIRTA]
FrameBufferName = \spool\drivers\w32x86\3\sse1mUM.dll
LFName = \spool\drivers\w32x86\3\sse1mlf.dll
