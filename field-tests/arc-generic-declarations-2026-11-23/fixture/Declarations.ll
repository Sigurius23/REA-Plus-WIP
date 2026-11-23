; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-generic-declarations-2026-11-23/fixture/Declarations.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-generic-declarations-2026-11-23/fixture/Declarations.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.protocol = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i32, i32, i32, i32, i32, i32 }
%swift.method_descriptor = type { i32, i32 }
%swift.protocol_requirement = type { i32, i32 }
%swift.enum_vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32, ptr, ptr, ptr }
%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_descriptor = type opaque
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%Ts6HasherV = type <{ %Ts6HasherV5_CoreV }>
%Ts6HasherV5_CoreV = type <{ %Ts6HasherV11_TailBufferV, %Ts6HasherV6_StateV }>
%Ts6HasherV11_TailBufferV = type <{ %Ts6UInt64V }>
%Ts6UInt64V = type <{ i64 }>
%Ts6HasherV6_StateV = type <{ %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V }>
%swift.opaque = type opaque
%T17OwnedDeclarations10DependencyVyAA6ClientVG = type <{ %T17OwnedDeclarations13InitialValuesV, ptr, %Ts12StaticStringV, [7 x i8], %Ts12StaticStringV, [7 x i8], %TSu }>
%T17OwnedDeclarations13InitialValuesV = type <{ %TSu, %TSu }>
%Ts12StaticStringV = type <{ i64, i64, i8 }>
%TSu = type <{ i64 }>
%T17OwnedDeclarations10DependencyVySbG = type <{ %T17OwnedDeclarations13InitialValuesV, ptr, %Ts12StaticStringV, [7 x i8], %Ts12StaticStringV, [7 x i8], %TSu }>
%swift.metadata_response = type { ptr, i64 }

@"symbolic _____y_____G 17OwnedDeclarations10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedDeclarations10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedDeclarations10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedDeclarations10DependencyVyAA6ClientVGMd" = linkonce_odr hidden global { ptr } zeroinitializer, align 8
@"$s17OwnedDeclarations10DependencyVyAA6ClientVGMR" = linkonce_odr hidden constant { i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 17OwnedDeclarations10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGMR" to i64)) to i32), i32 12 }, align 8
@"symbolic _____ySbG 17OwnedDeclarations10DependencyV" = linkonce_odr hidden constant <{ i8, i32, [4 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8 }>, ptr @"symbolic _____ySbG 17OwnedDeclarations10DependencyV", i32 0, i32 1) to i64)) to i32), [4 x i8] c"ySbG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedDeclarations10DependencyVySbGMd" = linkonce_odr hidden global { ptr } zeroinitializer, align 8
@"$s17OwnedDeclarations10DependencyVySbGMR" = linkonce_odr hidden constant { i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbG 17OwnedDeclarations10DependencyV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVySbGMR" to i64)) to i32), i32 9 }, align 8
@"$sSQMp" = external global %swift.protocol, align 4
@"got.$sSQMp" = private unnamed_addr constant ptr @"$sSQMp"
@"$sSQ2eeoiySbx_xtFZTq" = external global %swift.method_descriptor, align 4
@"got.$sSQ2eeoiySbx_xtFZTq" = private unnamed_addr constant ptr @"$sSQ2eeoiySbx_xtFZTq"
@"$s17OwnedDeclarations7SettingOSQAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s17OwnedDeclarations7SettingOSQAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQMp" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSQAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSQAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 1, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQ2eeoiySbx_xtFZTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSQAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSQAASQ2eeoiySbx_xtFZTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSQAAMc", i32 0, i32 6) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSQAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSQAAMc", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s17OwnedDeclarations7SettingOACSQAAWL" = linkonce_odr hidden local_unnamed_addr global ptr null, align 8
@"associated conformance 17OwnedDeclarations7SettingOSHAASQ" = linkonce_odr hidden constant <{ i8, i8, i32, i8 }> <{ i8 -1, i8 7, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAASQWb" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i8, i32, i8 }>, ptr @"associated conformance 17OwnedDeclarations7SettingOSHAASQ", i32 0, i32 2) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$sSHMp" = external global %swift.protocol, align 4
@"got.$sSHMp" = private unnamed_addr constant ptr @"$sSHMp"
@"$sSHSQTb" = external global %swift.protocol_requirement, align 4
@"got.$sSHSQTb" = private unnamed_addr constant ptr @"$sSHSQTb"
@"$sSH9hashValueSivgTq" = external global %swift.method_descriptor, align 4
@"got.$sSH9hashValueSivgTq" = private unnamed_addr constant ptr @"$sSH9hashValueSivgTq"
@"$sSH4hash4intoys6HasherVz_tFTq" = external global %swift.method_descriptor, align 4
@"got.$sSH4hash4intoys6HasherVz_tFTq" = private unnamed_addr constant ptr @"$sSH4hash4intoys6HasherVz_tFTq"
@"$sSH13_rawHashValue4seedS2i_tFTq" = external global %swift.method_descriptor, align 4
@"got.$sSH13_rawHashValue4seedS2i_tFTq" = private unnamed_addr constant ptr @"$sSH13_rawHashValue4seedS2i_tFTq"
@"$s17OwnedDeclarations7SettingOSHAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s17OwnedDeclarations7SettingOSHAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHMp" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 4, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHSQTb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"associated conformance 17OwnedDeclarations7SettingOSHAASQ", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 6) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH9hashValueSivgTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 7) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAASH9hashValueSivgTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 8) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH4hash4intoys6HasherVz_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 9) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAASH4hash4intoys6HasherVz_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 10) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH13_rawHashValue4seedS2i_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 11) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAASH13_rawHashValue4seedS2i_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 12) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOSHAAMc", i32 0, i32 16) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s17OwnedDeclarations7SettingO9hashValueSivpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$s17OwnedDeclarations7SettingOWV" = internal constant %swift.enum_vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s17OwnedDeclarations7SettingOwet", ptr @"$s17OwnedDeclarations7SettingOwst", i64 1, i64 1, i32 2097152, i32 253, ptr @"$s17OwnedDeclarations7SettingOwug", ptr @"$s17OwnedDeclarations7SettingOwup", ptr @"$s17OwnedDeclarations7SettingOwui" }, align 8
@.str.17.OwnedDeclarations = private constant [18 x i8] c"OwnedDeclarations\00"
@"$s17OwnedDeclarationsMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.17.OwnedDeclarations to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s17OwnedDeclarationsMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.7.Setting = private constant [8 x i8] c"Setting\00"
@"$s17OwnedDeclarations7SettingOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7SettingOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Setting to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7SettingOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7SettingOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7SettingOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 3 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations7SettingOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$s17OwnedDeclarations7SettingOWV", i64 513, ptr @"$s17OwnedDeclarations7SettingOMn" }>, align 8
@"symbolic _____ 17OwnedDeclarations7SettingO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations7SettingO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [6 x i8] c"first\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@1 = private constant [7 x i8] c"second\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@2 = private constant [6 x i8] c"third\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations7SettingOMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations7SettingO" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 3, i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOMF", i32 0, i32 10) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations7SettingOMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations6ClientVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedDeclarations6ClientVwCP", ptr @"$s17OwnedDeclarations6ClientVwxx", ptr @"$s17OwnedDeclarations6ClientVwcp", ptr @"$s17OwnedDeclarations6ClientVwca", ptr @__swift_memcpy16_8, ptr @"$s17OwnedDeclarations6ClientVwta", ptr @"$s17OwnedDeclarations6ClientVwet", ptr @"$s17OwnedDeclarations6ClientVwst", i64 16, i64 16, i32 65543, i32 2147483647 }, align 8
@.str.6.Client = private constant [7 x i8] c"Client\00"
@"$s17OwnedDeclarations6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$s17OwnedDeclarations6ClientVWV", i64 512, ptr @"$s17OwnedDeclarations6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 17OwnedDeclarations6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Sb_____Ybc 17OwnedDeclarations7SettingO" = linkonce_odr hidden constant <{ [2 x i8], i8, i32, [3 x i8], i8 }> <{ [2 x i8] c"Sb", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ [2 x i8], i8, i32, [3 x i8], i8 }>, ptr @"symbolic Sb_____Ybc 17OwnedDeclarations7SettingO", i32 0, i32 2) to i64)) to i32), [3 x i8] c"Ybc", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@3 = private constant [15 x i8] c"boolForSetting\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations6ClientV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb_____Ybc 17OwnedDeclarations7SettingO" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations13InitialValuesVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy16_8, ptr @__swift_noop_void_return, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @"$s17OwnedDeclarations13InitialValuesVwet", ptr @"$s17OwnedDeclarations13InitialValuesVwst", i64 16, i64 16, i32 7, i32 0 }, align 8
@.str.13.InitialValues = private constant [14 x i8] c"InitialValues\00"
@"$s17OwnedDeclarations13InitialValuesVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.13.InitialValues to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations13InitialValuesVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32 }> <{ ptr null, ptr @"$s17OwnedDeclarations13InitialValuesVWV", i64 512, ptr @"$s17OwnedDeclarations13InitialValuesVMn", i32 0, i32 8 }>, align 8
@"symbolic _____ 17OwnedDeclarations13InitialValuesV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations13InitialValuesV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Su" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Su", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedDeclarations13InitialValuesVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations13InitialValuesV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations13InitialValuesVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations13InitialValuesVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations13InitialValuesVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations13InitialValuesVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations10DependencyVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedDeclarations10DependencyVwCP", ptr @"$s17OwnedDeclarations10DependencyVwxx", ptr @"$s17OwnedDeclarations10DependencyVwcp", ptr @"$s17OwnedDeclarations10DependencyVwca", ptr @__swift_memcpy80_8, ptr @"$s17OwnedDeclarations10DependencyVwta", ptr @"$s17OwnedDeclarations10DependencyVwet", ptr @"$s17OwnedDeclarations10DependencyVwst", i64 80, i64 80, i32 196615, i32 2147483647 }, align 8
@4 = internal constant <{ i32, i32, i32, i32, i32, [4 x i8] }> <{ i32 0, i32 16, i32 24, i32 48, i32 72, [4 x i8] zeroinitializer }>, align 8
@.str.10.Dependency = private constant [11 x i8] c"Dependency\00"
@"$s17OwnedDeclarations10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedDeclarations10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 5, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations10DependencyVMP" = internal constant <{ i32, i32, i32, i32, i32, i16, i16 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMP" to i64)) to i32), i32 0, i32 1073741825, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s17OwnedDeclarations10DependencyVMP", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s17OwnedDeclarations10DependencyVMP", i32 0, i32 4) to i64)) to i32), i16 1, i16 3 }>, align 8
@"symbolic _____ 17OwnedDeclarations10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@5 = private constant [14 x i8] c"initialValues\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$ss7KeyPathCMn" = external global %swift.type_descriptor, align 4
@"got.$ss7KeyPathCMn" = private unnamed_addr constant ptr @"$ss7KeyPathCMn"
@"symbolic _____y_____xG s7KeyPathC 17OwnedDeclarations13InitialValuesV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 17OwnedDeclarations13InitialValuesV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 17OwnedDeclarations13InitialValuesV", i32 0, i32 4) to i64)) to i32), [2 x i8] c"xG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@6 = private constant [8 x i8] c"keyPath\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$ss12StaticStringVMn" = external global %swift.type_descriptor, align 4
@"got.$ss12StaticStringVMn" = private unnamed_addr constant ptr @"$ss12StaticStringVMn"
@"symbolic _____ s12StaticStringV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss12StaticStringVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ s12StaticStringV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@7 = private constant [9 x i8] c"filePath\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@8 = private constant [7 x i8] c"fileID\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@9 = private constant [5 x i8] c"line\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations10DependencyV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 5, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations13InitialValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @5 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____xG s7KeyPathC 17OwnedDeclarations13InitialValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @6 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 10) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ s12StaticStringV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @7 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 13) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ s12StaticStringV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 15) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @8 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 16) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 18) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @9 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations10DependencyVMF", i32 0, i32 19) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations14GenericClosureVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedDeclarations14GenericClosureVwCP", ptr @"$s17OwnedDeclarations14GenericClosureVwxx", ptr @"$s17OwnedDeclarations14GenericClosureVwcp", ptr @"$s17OwnedDeclarations14GenericClosureVwca", ptr @"$s17OwnedDeclarations14GenericClosureVwtk", ptr @"$s17OwnedDeclarations14GenericClosureVwta", ptr @"$s17OwnedDeclarations14GenericClosureVwet", ptr @"$s17OwnedDeclarations14GenericClosureVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.14.GenericClosure = private constant [15 x i8] c"GenericClosure\00"
@"$s17OwnedDeclarations14GenericClosureVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedDeclarations14GenericClosureVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.14.GenericClosure to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$syycWV" = external global ptr, align 8
@"$s17OwnedDeclarations14GenericClosureVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations14GenericClosureVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedDeclarations14GenericClosureV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations14GenericClosureV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic x" = linkonce_odr hidden constant <{ [1 x i8], i8 }> <{ [1 x i8] c"x", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@10 = private constant [6 x i8] c"value\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@11 = private constant [10 x i8] c"predicate\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations14GenericClosureVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations14GenericClosureV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations14GenericClosureVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @10 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations14GenericClosureVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb_____Ybc 17OwnedDeclarations7SettingO" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations14GenericClosureVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @11 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations14GenericClosureVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations11GenericEnumOWV" = internal constant %swift.enum_vwtable { ptr @"$s17OwnedDeclarations11GenericEnumOwCP", ptr @"$s17OwnedDeclarations11GenericEnumOwxx", ptr @"$s17OwnedDeclarations11GenericEnumOwcp", ptr @"$s17OwnedDeclarations11GenericEnumOwca", ptr @"$s17OwnedDeclarations11GenericEnumOwtk", ptr @"$s17OwnedDeclarations11GenericEnumOwta", ptr @"$s17OwnedDeclarations11GenericEnumOwet", ptr @"$s17OwnedDeclarations11GenericEnumOwst", i64 0, i64 0, i32 6291456, i32 0, ptr @"$s17OwnedDeclarations11GenericEnumOwug", ptr @"$s17OwnedDeclarations11GenericEnumOwup", ptr @"$s17OwnedDeclarations11GenericEnumOwui" }, align 8
@.str.11.GenericEnum = private constant [12 x i8] c"GenericEnum\00"
@"$s17OwnedDeclarations11GenericEnumOMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedDeclarations11GenericEnumOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 210, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.11.GenericEnum to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations11GenericEnumOMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMi" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMP", i32 0, i32 1) to i64)) to i32), i32 1075838976, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations11GenericEnumOMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedDeclarations11GenericEnumO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations11GenericEnumO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@12 = private constant [5 x i8] c"none\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations11GenericEnumOMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations11GenericEnumO" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 2, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations11GenericEnumOMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @10 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations11GenericEnumOMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @12 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations11GenericEnumOMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sytWV" = external global ptr, align 8
@.str.7.Foreign = private constant [8 x i8] c"Foreign\00"
@"$s17OwnedDeclarations7ForeignOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Foreign to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations7ForeignOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$sytWV", i64 513, ptr @"$s17OwnedDeclarations7ForeignOMn" }>, align 8
@"symbolic _____ 17OwnedDeclarations7ForeignO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations7ForeignO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedDeclarations7ForeignOMF" = internal constant { i32, i32, i16, i16, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations7ForeignO" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 0 }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7ForeignO10DependencyVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwCP", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwxx", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwcp", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwca", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwtk", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwta", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwet", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@"$s17OwnedDeclarations7ForeignO10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedDeclarations7ForeignO10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations7ForeignO10DependencyVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedDeclarations7ForeignO10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations7ForeignO10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@13 = private constant [6 x i8] c"other\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations7ForeignO10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations7ForeignO10DependencyV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @13 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations4RootVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedDeclarations4RootVwCP", ptr @"$s17OwnedDeclarations4RootVwxx", ptr @"$s17OwnedDeclarations4RootVwcp", ptr @"$s17OwnedDeclarations4RootVwca", ptr @__swift_memcpy176_8, ptr @"$s17OwnedDeclarations4RootVwta", ptr @"$s17OwnedDeclarations4RootVwet", ptr @"$s17OwnedDeclarations4RootVwst", i64 176, i64 176, i32 196615, i32 2147483647 }, align 8
@.str.4.Root = private constant [5 x i8] c"Root\00"
@"$s17OwnedDeclarations4RootVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations4RootVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.4.Root to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations4RootVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations4RootVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedDeclarations4RootVMn", i32 0, i32 4) to i64)) to i32), i32 3, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedDeclarations4RootVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }> <{ ptr null, ptr @"$s17OwnedDeclarations4RootVWV", i64 512, ptr @"$s17OwnedDeclarations4RootVMn", i32 0, i32 80, i32 160, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 17OwnedDeclarations4RootV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedDeclarations4RootV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@14 = private constant [7 x i8] c"client\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@15 = private constant [7 x i8] c"scalar\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y______G 17OwnedDeclarations7ForeignO10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y______G 17OwnedDeclarations7ForeignO10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [2 x i8] c"y_", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y______G 17OwnedDeclarations7ForeignO10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@16 = private constant [8 x i8] c"foreign\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedDeclarations4RootVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedDeclarations4RootV" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 3, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 17OwnedDeclarations10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @14 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbG 17OwnedDeclarations10DependencyV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @15 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 10) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y______G 17OwnedDeclarations7ForeignO10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @16 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedDeclarations4RootVMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7SettingOSQAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSQAAMc" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSQAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7SettingOSHAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAAMc" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOSHAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7SettingOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7SettingOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations13InitialValuesVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations13InitialValuesVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations14GenericClosureVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations14GenericClosureVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations11GenericEnumOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations11GenericEnumOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7ForeignOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations7ForeignO10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations7ForeignO10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedDeclarations4RootVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedDeclarations4RootVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [92 x ptr] [ptr @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0VvM", ptr @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0Vvg", ptr @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0Vvs", ptr @"$s17OwnedDeclarations10DependencyV4lineSuvM", ptr @"$s17OwnedDeclarations10DependencyV4lineSuvg", ptr @"$s17OwnedDeclarations10DependencyV4lineSuvs", ptr @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvM", ptr @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvg", ptr @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvs", ptr @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvM", ptr @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvg", ptr @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvs", ptr @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvM", ptr @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvg", ptr @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvs", ptr @"$s17OwnedDeclarations10DependencyVHn", ptr @"$s17OwnedDeclarations10DependencyVMF", ptr @"$s17OwnedDeclarations10DependencyVMa", ptr @"$s17OwnedDeclarations10DependencyVMn", ptr @"$s17OwnedDeclarations11GenericEnumOHn", ptr @"$s17OwnedDeclarations11GenericEnumOMF", ptr @"$s17OwnedDeclarations11GenericEnumOMa", ptr @"$s17OwnedDeclarations11GenericEnumOMn", ptr @"$s17OwnedDeclarations13InitialValuesV5firstSuvM", ptr @"$s17OwnedDeclarations13InitialValuesV5firstSuvg", ptr @"$s17OwnedDeclarations13InitialValuesV5firstSuvs", ptr @"$s17OwnedDeclarations13InitialValuesV6secondSuvM", ptr @"$s17OwnedDeclarations13InitialValuesV6secondSuvg", ptr @"$s17OwnedDeclarations13InitialValuesV6secondSuvs", ptr @"$s17OwnedDeclarations13InitialValuesVHn", ptr @"$s17OwnedDeclarations13InitialValuesVMF", ptr @"$s17OwnedDeclarations13InitialValuesVMa", ptr @"$s17OwnedDeclarations13InitialValuesVMn", ptr @"$s17OwnedDeclarations13InitialValuesVN", ptr @"$s17OwnedDeclarations14GenericClosureV5valuexvM", ptr @"$s17OwnedDeclarations14GenericClosureV5valuexvg", ptr @"$s17OwnedDeclarations14GenericClosureV5valuexvs", ptr @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvM", ptr @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvg", ptr @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvs", ptr @"$s17OwnedDeclarations14GenericClosureVHn", ptr @"$s17OwnedDeclarations14GenericClosureVMF", ptr @"$s17OwnedDeclarations14GenericClosureVMa", ptr @"$s17OwnedDeclarations14GenericClosureVMn", ptr @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvM", ptr @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvg", ptr @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvs", ptr @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvM", ptr @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvg", ptr @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvs", ptr @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvM", ptr @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvg", ptr @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvs", ptr @"$s17OwnedDeclarations4RootVHn", ptr @"$s17OwnedDeclarations4RootVMF", ptr @"$s17OwnedDeclarations4RootVMa", ptr @"$s17OwnedDeclarations4RootVMn", ptr @"$s17OwnedDeclarations4RootVN", ptr @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvM", ptr @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvg", ptr @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvs", ptr @"$s17OwnedDeclarations6ClientVHn", ptr @"$s17OwnedDeclarations6ClientVMF", ptr @"$s17OwnedDeclarations6ClientVMa", ptr @"$s17OwnedDeclarations6ClientVMn", ptr @"$s17OwnedDeclarations6ClientVN", ptr @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvM", ptr @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvg", ptr @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvs", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVHn", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMF", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMa", ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMn", ptr @"$s17OwnedDeclarations7ForeignOHn", ptr @"$s17OwnedDeclarations7ForeignOMF", ptr @"$s17OwnedDeclarations7ForeignOMa", ptr @"$s17OwnedDeclarations7ForeignOMn", ptr @"$s17OwnedDeclarations7ForeignON", ptr @"$s17OwnedDeclarations7SettingO21__derived_enum_equalsySbAC_ACtFZ", ptr @"$s17OwnedDeclarations7SettingO4hash4intoys6HasherVz_tF", ptr @"$s17OwnedDeclarations7SettingO9hashValueSivg", ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV", ptr @"$s17OwnedDeclarations7SettingOHn", ptr @"$s17OwnedDeclarations7SettingOMF", ptr @"$s17OwnedDeclarations7SettingOMa", ptr @"$s17OwnedDeclarations7SettingOMn", ptr @"$s17OwnedDeclarations7SettingON", ptr @"$s17OwnedDeclarations7SettingOSHAAHc", ptr @"$s17OwnedDeclarations7SettingOSHAAMc", ptr @"$s17OwnedDeclarations7SettingOSQAAHc", ptr @"$s17OwnedDeclarations7SettingOSQAAMc", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations13InitialValuesV5firstSuvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations13InitialValuesV6secondSuvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0VvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations10DependencyV4lineSuvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations14GenericClosureV5valuexvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedDeclarations7SettingO9hashValueSivpMV"
@"$s17OwnedDeclarations7SettingON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedDeclarations7SettingOMf", i32 0, i32 2)
@"$s17OwnedDeclarations6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedDeclarations6ClientVMf", i32 0, i32 2)
@"$s17OwnedDeclarations13InitialValuesVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMf", i32 0, i32 2)
@"$s17OwnedDeclarations7ForeignON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedDeclarations7ForeignOMf", i32 0, i32 2)
@"$s17OwnedDeclarations4RootVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }>, ptr @"$s17OwnedDeclarations4RootVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedDeclarations7SettingO21__derived_enum_equalsySbAC_ACtFZ"(i8 %0, i8 %1) #0 {
entry:
  %2 = icmp eq i8 %0, %1
  ret i1 %2
}

define swiftcc void @"$s17OwnedDeclarations7SettingO4hash4intoys6HasherVz_tF"(ptr captures(none) dereferenceable(72) %0, i8 %1) #1 {
entry:
  %2 = zext i8 %1 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(72) %0)
  ret void
}

declare swiftcc void @"$ss6HasherV8_combineyySuF"(i64, ptr swiftself captures(none) dereferenceable(72)) local_unnamed_addr #1

define swiftcc i64 @"$s17OwnedDeclarations7SettingO9hashValueSivg"(i8 %0) #1 {
entry:
  %1 = alloca %Ts6HasherV, align 8
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %1)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %1, i64 0)
  %2 = zext i8 %0 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(72) %1)
  %3 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %1)
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %1)
  ret i64 %3
}

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.start.p0(i64 immarg, ptr captures(none)) #2

declare swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias sret(%Ts6HasherV) captures(none), i64) local_unnamed_addr #1

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias writeonly captures(none), ptr noalias readonly captures(none), i64, i1 immarg) #3

declare swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr swiftself captures(none) dereferenceable(72)) local_unnamed_addr #1

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.end.p0(i64 immarg, ptr captures(none)) #2

define linkonce_odr hidden swiftcc i1 @"$s17OwnedDeclarations7SettingOSQAASQ2eeoiySbx_xtFZTW"(ptr noalias captures(none) dereferenceable(1) %0, ptr noalias captures(none) dereferenceable(1) %1, ptr swiftself %2, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %3 = load i8, ptr %0, align 1
  %4 = load i8, ptr %1, align 1
  %5 = icmp eq i8 %3, %4
  ret i1 %5
}

define linkonce_odr hidden swiftcc i64 @"$s17OwnedDeclarations7SettingOSHAASH9hashValueSivgTW"(ptr noalias swiftself captures(none) dereferenceable(1) %0, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %1 = alloca %Ts6HasherV, align 8
  %2 = load i8, ptr %0, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %1)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %1, i64 0) #22
  %3 = zext i8 %2 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %1) #22
  %4 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %1) #22
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %1)
  ret i64 %4
}

define linkonce_odr hidden swiftcc void @"$s17OwnedDeclarations7SettingOSHAASH4hash4intoys6HasherVz_tFTW"(ptr captures(none) dereferenceable(72) %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = load i8, ptr %1, align 1
  %3 = zext i8 %2 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %0) #22
  ret void
}

define linkonce_odr hidden swiftcc i64 @"$s17OwnedDeclarations7SettingOSHAASH13_rawHashValue4seedS2i_tFTW"(i64 %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = alloca %Ts6HasherV, align 8
  %3 = load i8, ptr %1, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %2)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %2, i64 %0) #22
  %4 = zext i8 %3 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %4, ptr nonnull swiftself captures(none) dereferenceable(72) %2) #22
  %5 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %2) #22
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %2)
  ret i64 %5
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvg"(ptr %0, ptr %1) #4 {
entry:
  %2 = insertvalue { ptr, ptr } undef, ptr %0, 0
  %3 = insertvalue { ptr, ptr } %2, ptr %1, 1
  %4 = tail call ptr @swift_retain(ptr returned %1) #23
  ret { ptr, ptr } %3
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #5

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvs"(ptr %0, ptr %1, ptr swiftself captures(none) dereferenceable(16) initializes((0, 8)) %2) #6 {
entry:
  %.boolForSetting.data = getelementptr inbounds nuw i8, ptr %2, i64 8
  %3 = load ptr, ptr %.boolForSetting.data, align 8
  tail call void @swift_release(ptr %3) #7
  store ptr %0, ptr %2, align 8
  store ptr %1, ptr %.boolForSetting.data, align 8
  ret void
}

; Function Attrs: nounwind
declare void @swift_release(ptr) local_unnamed_addr #7

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(16) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations6ClientV14boolForSettingySbAA0F0OYbcvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s17OwnedDeclarations13InitialValuesV5firstSuvg"(i64 returned %0, i64 %1) #0 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations13InitialValuesV5firstSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(16) initializes((0, 8)) %1) #9 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations13InitialValuesV5firstSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(16) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations13InitialValuesV5firstSuvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations13InitialValuesV5firstSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s17OwnedDeclarations13InitialValuesV6secondSuvg"(i64 %0, i64 returned %1) #0 {
entry:
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations13InitialValuesV6secondSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(16) initializes((8, 16)) %1) #9 {
entry:
  %.second = getelementptr inbounds nuw i8, ptr %1, i64 8
  store i64 %0, ptr %.second, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations13InitialValuesV6secondSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(16) %1) #8 {
coro.return:
  %.second = getelementptr inbounds nuw i8, ptr %1, i64 8
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations13InitialValuesV6secondSuvM.resume.0", ptr poison }, ptr %.second, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations13InitialValuesV6secondSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { i64, i64 } @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0Vvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) dereferenceable(80) %0) #10 {
entry:
  %1 = load i64, ptr %0, align 8
  %.initialValues.second = getelementptr inbounds nuw i8, ptr %0, i64 8
  %2 = load i64, ptr %.initialValues.second, align 8
  %3 = insertvalue { i64, i64 } undef, i64 %1, 0
  %4 = insertvalue { i64, i64 } %3, i64 %2, 1
  ret { i64, i64 } %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0Vvs"(i64 %0, i64 %1, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself writeonly captures(none) dereferenceable(80) initializes((0, 16)) %2) #9 {
entry:
  store i64 %0, ptr %2, align 8
  %.initialValues.second = getelementptr inbounds nuw i8, ptr %2, i64 8
  store i64 %1, ptr %.initialValues.second, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0VvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0VvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations10DependencyV13initialValuesAA07InitialE0VvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) dereferenceable(80) %0) #4 {
entry:
  %.keyPath = getelementptr inbounds nuw i8, ptr %0, i64 16
  %1 = load ptr, ptr %.keyPath, align 8
  %2 = tail call ptr @swift_retain(ptr returned %1) #23
  ret ptr %1
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvs"(ptr %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #6 {
entry:
  %.keyPath = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = load ptr, ptr %.keyPath, align 8
  tail call void @swift_release(ptr %2) #7
  store ptr %0, ptr %.keyPath, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #8 {
coro.return:
  %.keyPath = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvM.resume.0", ptr poison }, ptr %.keyPath, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations10DependencyV7keyPaths03KeyE0CyAA13InitialValuesVxGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { i64, i64, i8 } @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) dereferenceable(80) %0) #10 {
entry:
  %.filePath = getelementptr inbounds nuw i8, ptr %0, i64 24
  %1 = load i64, ptr %.filePath, align 8
  %.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %0, i64 32
  %2 = load i64, ptr %.filePath._utf8CodeUnitCount, align 8
  %.filePath._flags = getelementptr inbounds nuw i8, ptr %0, i64 40
  %3 = load i8, ptr %.filePath._flags, align 8
  %4 = insertvalue { i64, i64, i8 } undef, i64 %1, 0
  %5 = insertvalue { i64, i64, i8 } %4, i64 %2, 1
  %6 = insertvalue { i64, i64, i8 } %5, i8 %3, 2
  ret { i64, i64, i8 } %6
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvs"(i64 %0, i64 %1, i8 %2, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself writeonly captures(none) dereferenceable(80) initializes((24, 41)) %3) #9 {
entry:
  %.filePath = getelementptr inbounds nuw i8, ptr %3, i64 24
  store i64 %0, ptr %.filePath, align 8
  %.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %3, i64 32
  store i64 %1, ptr %.filePath._utf8CodeUnitCount, align 8
  %.filePath._flags = getelementptr inbounds nuw i8, ptr %3, i64 40
  store i8 %2, ptr %.filePath._flags, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #8 {
coro.return:
  %.filePath = getelementptr inbounds nuw i8, ptr %1, i64 24
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvM.resume.0", ptr poison }, ptr %.filePath, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations10DependencyV8filePaths12StaticStringVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { i64, i64, i8 } @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) dereferenceable(80) %0) #10 {
entry:
  %.fileID = getelementptr inbounds nuw i8, ptr %0, i64 48
  %1 = load i64, ptr %.fileID, align 8
  %.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %0, i64 56
  %2 = load i64, ptr %.fileID._utf8CodeUnitCount, align 8
  %.fileID._flags = getelementptr inbounds nuw i8, ptr %0, i64 64
  %3 = load i8, ptr %.fileID._flags, align 8
  %4 = insertvalue { i64, i64, i8 } undef, i64 %1, 0
  %5 = insertvalue { i64, i64, i8 } %4, i64 %2, 1
  %6 = insertvalue { i64, i64, i8 } %5, i8 %3, 2
  ret { i64, i64, i8 } %6
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvs"(i64 %0, i64 %1, i8 %2, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself writeonly captures(none) dereferenceable(80) initializes((48, 65)) %3) #9 {
entry:
  %.fileID = getelementptr inbounds nuw i8, ptr %3, i64 48
  store i64 %0, ptr %.fileID, align 8
  %.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %3, i64 56
  store i64 %1, ptr %.fileID._utf8CodeUnitCount, align 8
  %.fileID._flags = getelementptr inbounds nuw i8, ptr %3, i64 64
  store i8 %2, ptr %.fileID._flags, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #8 {
coro.return:
  %.fileID = getelementptr inbounds nuw i8, ptr %1, i64 48
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvM.resume.0", ptr poison }, ptr %.fileID, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations10DependencyV6fileIDs12StaticStringVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i64 @"$s17OwnedDeclarations10DependencyV4lineSuvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) dereferenceable(80) %0) #10 {
entry:
  %.line = getelementptr inbounds nuw i8, ptr %0, i64 72
  %1 = load i64, ptr %.line, align 8
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedDeclarations10DependencyV4lineSuvs"(i64 %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself writeonly captures(none) dereferenceable(80) initializes((72, 80)) %1) #9 {
entry:
  %.line = getelementptr inbounds nuw i8, ptr %1, i64 72
  store i64 %0, ptr %.line, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations10DependencyV4lineSuvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(80) %1) #8 {
coro.return:
  %.line = getelementptr inbounds nuw i8, ptr %1, i64 72
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations10DependencyV4lineSuvM.resume.0", ptr poison }, ptr %.line, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations10DependencyV4lineSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

define swiftcc void @"$s17OwnedDeclarations14GenericClosureV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"GenericClosure<Value>", ptr noalias swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %1, ptr %Value) #7
  ret void
}

define swiftcc void @"$s17OwnedDeclarations14GenericClosureV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %"GenericClosure<Value>", ptr swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %AssignWithTake(ptr noalias %1, ptr noalias %0, ptr %Value) #7
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations14GenericClosureV5valuexvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"GenericClosure<Value>", ptr swiftself %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations14GenericClosureV5valuexvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations14GenericClosureV5valuexvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvg"(ptr readonly captures(none) %"GenericClosure<Value>", ptr noalias readonly swiftself captures(none) %0) #4 {
entry:
  %1 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 28
  %2 = load i32, ptr %1, align 8
  %3 = sext i32 %2 to i64
  %4 = getelementptr inbounds i8, ptr %0, i64 %3
  %5 = load ptr, ptr %4, align 8
  %.data = getelementptr inbounds nuw i8, ptr %4, i64 8
  %6 = load ptr, ptr %.data, align 8
  %7 = insertvalue { ptr, ptr } undef, ptr %5, 0
  %8 = insertvalue { ptr, ptr } %7, ptr %6, 1
  %9 = tail call ptr @swift_retain(ptr returned %6) #23
  ret { ptr, ptr } %8
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvs"(ptr %0, ptr %1, ptr readonly captures(none) %"GenericClosure<Value>", ptr swiftself captures(none) %2) #6 {
entry:
  %3 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 28
  %4 = load i32, ptr %3, align 8
  %5 = sext i32 %4 to i64
  %6 = getelementptr inbounds i8, ptr %2, i64 %5
  %.data = getelementptr inbounds nuw i8, ptr %6, i64 8
  %7 = load ptr, ptr %.data, align 8
  tail call void @swift_release(ptr %7) #7
  store ptr %0, ptr %6, align 8
  store ptr %1, ptr %.data, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvM"(ptr noalias dereferenceable(32) %0, ptr readonly captures(none) %"GenericClosure<Value>", ptr swiftself %1) #8 {
coro.return:
  %2 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 28
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvM.resume.0", ptr poison }, ptr %5, 1
  ret { ptr, ptr } %6
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations14GenericClosureV9predicateySbAA7SettingOYbcvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Foreign.Dependency<Value>", ptr swiftself %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvg"(ptr noalias sret(%T17OwnedDeclarations10DependencyVyAA6ClientVG) captures(none) %0, ptr noalias swiftself captures(none) dereferenceable(176) %1) #6 {
entry:
  %2 = call ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOcTm"(ptr %1, ptr %0, ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGMd", ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGMR")
  ret void
}

; Function Attrs: mustprogress nofree noinline nounwind willreturn memory(read)
define linkonce_odr hidden ptr @__swift_instantiateConcreteTypeFromMangledNameV2(ptr %0, ptr %1) local_unnamed_addr #11 {
entry:
  %2 = load atomic ptr, ptr %0 monotonic, align 8
  %3 = icmp eq ptr %2, null
  %4 = ptrtoint ptr %2 to i64
  %5 = and i64 %4, 1
  %6 = icmp ne i64 %5, 0
  %7 = or i1 %3, %6
  br i1 %7, label %10, label %8

8:                                                ; preds = %10, %entry
  %9 = phi ptr [ %2, %entry ], [ %17, %10 ]
  ret ptr %9

10:                                               ; preds = %entry
  %11 = load i64, ptr %1, align 8
  %12 = ashr i64 %11, 32
  %sext = shl i64 %11, 32
  %13 = ashr exact i64 %sext, 32
  %14 = ptrtoint ptr %1 to i64
  %15 = add i64 %13, %14
  %16 = inttoptr i64 %15 to ptr
  %17 = tail call swiftcc ptr @swift_getTypeByMangledNameInContext2(ptr %16, i64 %12, ptr null, ptr null) #24
  store atomic ptr %17, ptr %0 monotonic, align 8
  br label %8
}

; Function Attrs: nounwind memory(argmem: readwrite)
declare swiftcc ptr @swift_getTypeByMangledNameInContext2(ptr, i64, ptr, ptr) local_unnamed_addr #12

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvs"(ptr noalias captures(none) dereferenceable(80) %0, ptr swiftself captures(none) dereferenceable(176) %1) #6 {
entry:
  %2 = call ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOdTm"(ptr %0, ptr %1, ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGMd", ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGMR")
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(176) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations4RootV6clientAA10DependencyVyAA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvg"(ptr noalias sret(%T17OwnedDeclarations10DependencyVySbG) captures(none) %0, ptr noalias swiftself captures(none) dereferenceable(176) %1) #6 {
entry:
  %.scalar = getelementptr inbounds nuw i8, ptr %1, i64 80
  %2 = call ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOcTm"(ptr %.scalar, ptr %0, ptr @"$s17OwnedDeclarations10DependencyVySbGMd", ptr @"$s17OwnedDeclarations10DependencyVySbGMR")
  ret void
}

; Function Attrs: noinline nounwind
define internal ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOcTm"(ptr %0, ptr %1, ptr %2, ptr %3) local_unnamed_addr #8 {
entry:
  %4 = tail call ptr @__swift_instantiateConcreteTypeFromMangledNameV2(ptr nonnull %2, ptr nonnull %3) #25
  %5 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %5, align 8, !invariant.load !17, !dereferenceable !18
  %6 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = tail call ptr %InitializeWithCopy(ptr noalias %1, ptr noalias %0, ptr %4) #7
  ret ptr %1
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvs"(ptr noalias captures(none) dereferenceable(80) %0, ptr swiftself captures(none) dereferenceable(176) %1) #6 {
entry:
  %.scalar = getelementptr inbounds nuw i8, ptr %1, i64 80
  %2 = call ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOdTm"(ptr %0, ptr %.scalar, ptr @"$s17OwnedDeclarations10DependencyVySbGMd", ptr @"$s17OwnedDeclarations10DependencyVySbGMR")
  ret void
}

; Function Attrs: noinline nounwind
define internal ptr @"$s17OwnedDeclarations10DependencyVyAA6ClientVGWOdTm"(ptr %0, ptr %1, ptr %2, ptr %3) local_unnamed_addr #8 {
entry:
  %4 = tail call ptr @__swift_instantiateConcreteTypeFromMangledNameV2(ptr nonnull %2, ptr nonnull %3) #25
  %5 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %5, align 8, !invariant.load !17, !dereferenceable !18
  %6 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = tail call ptr %AssignWithTake(ptr noalias %1, ptr noalias %0, ptr %4) #7
  ret ptr %1
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(176) %1) #8 {
coro.return:
  %.scalar = getelementptr inbounds nuw i8, ptr %1, i64 80
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvM.resume.0", ptr poison }, ptr %.scalar, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations4RootV6scalarAA10DependencyVySbGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(176) %0) #4 {
entry:
  %.foreign = getelementptr inbounds nuw i8, ptr %0, i64 160
  %1 = load ptr, ptr %.foreign, align 8
  %.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %0, i64 168
  %2 = load ptr, ptr %.foreign.other.boolForSetting.data, align 8
  %3 = insertvalue { ptr, ptr } undef, ptr %1, 0
  %4 = insertvalue { ptr, ptr } %3, ptr %2, 1
  %5 = tail call ptr @swift_retain(ptr returned %2) #23
  ret { ptr, ptr } %4
}

; Function Attrs: nounwind
define swiftcc void @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvs"(ptr %0, ptr %1, ptr swiftself captures(none) dereferenceable(176) initializes((160, 168)) %2) #6 {
entry:
  %.foreign = getelementptr inbounds nuw i8, ptr %2, i64 160
  %.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %2, i64 168
  %3 = load ptr, ptr %.foreign.other.boolForSetting.data, align 8
  tail call void @swift_release(ptr %3) #7
  store ptr %0, ptr %.foreign, align 8
  store ptr %1, ptr %.foreign.other.boolForSetting.data, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(176) %1) #8 {
coro.return:
  %.foreign = getelementptr inbounds nuw i8, ptr %1, i64 160
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvM.resume.0", ptr poison }, ptr %.foreign, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedDeclarations4RootV7foreignAA7ForeignO10DependencyVy_AA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: nofree nosync nounwind memory(none)
define internal swiftcc ptr @"$s17OwnedDeclarations7SettingOSHAASQWb"(ptr readnone captures(none) %Setting, ptr readnone captures(none) %Setting1, ptr readnone captures(none) %Setting.Hashable) #13 {
entry:
  %0 = tail call ptr @"$s17OwnedDeclarations7SettingOACSQAAWl"() #26
  ret ptr %0
}

; Function Attrs: nofree noinline nosync nounwind memory(none)
define linkonce_odr hidden ptr @"$s17OwnedDeclarations7SettingOACSQAAWl"() local_unnamed_addr #14 {
entry:
  %0 = load ptr, ptr @"$s17OwnedDeclarations7SettingOACSQAAWL", align 8
  %1 = icmp eq ptr %0, null
  br i1 %1, label %cacheIsNull, label %cont

cacheIsNull:                                      ; preds = %entry
  %2 = tail call ptr @swift_getWitnessTable(ptr nonnull @"$s17OwnedDeclarations7SettingOSQAAMc", ptr nonnull getelementptr inbounds nuw (i8, ptr @"$s17OwnedDeclarations7SettingOMf", i64 16), ptr undef) #25
  store atomic ptr %2, ptr @"$s17OwnedDeclarations7SettingOACSQAAWL" release, align 8
  br label %cont

cont:                                             ; preds = %cacheIsNull, %entry
  %3 = phi ptr [ %0, %entry ], [ %2, %cacheIsNull ]
  ret ptr %3
}

; Function Attrs: nofree nounwind memory(read)
declare ptr @swift_getWitnessTable(ptr, ptr, ptr) local_unnamed_addr #15

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy1_1(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = load i8, ptr %1, align 1
  store i8 %3, ptr %0, align 1
  ret ptr %0
}

; Function Attrs: nounwind
define linkonce_odr hidden void @__swift_noop_void_return(ptr %0, ptr %1) #6 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedDeclarations7SettingOwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %34, label %1

1:                                                ; preds = %entry
  %2 = icmp ugt i32 %numEmptyCases, 253
  br i1 %2, label %3, label %28

3:                                                ; preds = %1
  %4 = add i32 %numEmptyCases, 2
  %5 = icmp ult i32 %4, 65280
  %6 = icmp ult i32 %4, 16776960
  %7 = select i1 %6, i32 2, i32 4
  %8 = select i1 %5, i32 1, i32 %7
  %9 = getelementptr inbounds nuw i8, ptr %value, i64 1
  switch i32 %8, label %18 [
    i32 4, label %16
    i32 1, label %10
    i32 2, label %13
  ]

10:                                               ; preds = %3
  %11 = load i8, ptr %9, align 1
  %12 = zext i8 %11 to i32
  br label %19

13:                                               ; preds = %3
  %14 = load i16, ptr %9, align 1
  %15 = zext i16 %14 to i32
  br label %19

16:                                               ; preds = %3
  %17 = load i32, ptr %9, align 1
  br label %19

18:                                               ; preds = %3
  unreachable

19:                                               ; preds = %16, %13, %10
  %20 = phi i32 [ %12, %10 ], [ %15, %13 ], [ %17, %16 ]
  %21 = icmp eq i32 %20, 0
  br i1 %21, label %28, label %22

22:                                               ; preds = %19
  %23 = shl i32 %20, 8
  %24 = load i8, ptr %value, align 1
  %25 = zext i8 %24 to i32
  %26 = add i32 %23, -3
  %27 = add i32 %26, %25
  br label %34

28:                                               ; preds = %19, %1
  %29 = load i8, ptr %value, align 1
  %30 = zext i8 %29 to i32
  %31 = add nsw i32 %30, -3
  %32 = icmp ult i8 %29, 3
  %33 = select i1 %32, i32 -1, i32 %31
  br label %34

34:                                               ; preds = %entry, %28, %22
  %35 = phi i32 [ %33, %28 ], [ %27, %22 ], [ -1, %entry ]
  %36 = add i32 %35, 1
  ret i32 %36
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations7SettingOwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 1
  %1 = icmp ugt i32 %numEmptyCases, 253
  br i1 %1, label %2, label %8

2:                                                ; preds = %entry
  %3 = add i32 %numEmptyCases, 2
  %4 = icmp ult i32 %3, 65280
  %5 = icmp ult i32 %3, 16776960
  %6 = select i1 %5, i32 2, i32 4
  %7 = select i1 %4, i32 1, i32 %6
  br label %8

8:                                                ; preds = %2, %entry
  %9 = phi i32 [ 0, %entry ], [ %7, %2 ]
  %10 = icmp ult i32 %whichCase, 254
  br i1 %10, label %11, label %21

11:                                               ; preds = %8
  switch i32 %9, label %15 [
    i32 0, label %16
    i32 1, label %12
    i32 2, label %13
    i32 4, label %14
  ]

12:                                               ; preds = %11
  store i8 0, ptr %0, align 1
  br label %16

13:                                               ; preds = %11
  store i16 0, ptr %0, align 1
  br label %16

14:                                               ; preds = %11
  store i32 0, ptr %0, align 1
  br label %16

15:                                               ; preds = %11
  unreachable

16:                                               ; preds = %11, %14, %13, %12
  %17 = icmp eq i32 %whichCase, 0
  br i1 %17, label %32, label %18

18:                                               ; preds = %16
  %19 = trunc nuw i32 %whichCase to i8
  %20 = add nuw i8 %19, 2
  store i8 %20, ptr %value, align 1
  br label %32

21:                                               ; preds = %8
  %22 = add i32 %whichCase, -254
  %23 = lshr i32 %22, 8
  %24 = add nuw nsw i32 %23, 1
  %25 = trunc i32 %22 to i8
  store i8 %25, ptr %value, align 1
  switch i32 %9, label %31 [
    i32 0, label %32
    i32 1, label %26
    i32 2, label %28
    i32 4, label %30
  ]

26:                                               ; preds = %21
  %27 = trunc i32 %24 to i8
  store i8 %27, ptr %0, align 1
  br label %32

28:                                               ; preds = %21
  %29 = trunc i32 %24 to i16
  store i16 %29, ptr %0, align 1
  br label %32

30:                                               ; preds = %21
  store i32 %24, ptr %0, align 1
  br label %32

31:                                               ; preds = %21
  unreachable

32:                                               ; preds = %26, %28, %30, %21, %18, %16
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal range(i32 0, 256) i32 @"$s17OwnedDeclarations7SettingOwug"(ptr noalias readonly captures(none) %value, ptr readnone captures(none) %Setting) #10 {
entry:
  %0 = load i8, ptr %value, align 1
  %1 = zext i8 %0 to i32
  ret i32 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal void @"$s17OwnedDeclarations7SettingOwup"(ptr noalias readnone captures(none) %value, ptr readnone captures(none) %Setting) #0 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations7SettingOwui"(ptr noalias writeonly captures(none) initializes((0, 1)) %value, i32 %tag, ptr readnone captures(none) %Setting) #9 {
entry:
  %0 = trunc i32 %tag to i8
  store i8 %0, ptr %value, align 1
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations7SettingOMa"(i64 %0) #16 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedDeclarations7SettingOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s17OwnedDeclarations6ClientVwCP"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Client) #4 {
entry:
  %src.boolForSetting.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %0 = load ptr, ptr %src.boolForSetting.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  %2 = tail call ptr @swift_retain(ptr returned %0) #23
  ret ptr %dest
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations6ClientVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Client) #6 {
entry:
  %object.boolForSetting.data = getelementptr inbounds nuw i8, ptr %object, i64 8
  %0 = load ptr, ptr %object.boolForSetting.data, align 8
  tail call void @swift_release(ptr %0) #7
  ret void
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations6ClientVwca"(ptr returned captures(ret: address, provenance) initializes((0, 8)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Client) #6 {
entry:
  %src.boolForSetting.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %dest.boolForSetting.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.boolForSetting.data, align 8
  %1 = load ptr, ptr %src.boolForSetting.data, align 8
  %2 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %2, ptr %dest, align 8
  %3 = tail call ptr @swift_retain(ptr returned %1) #23
  tail call void @swift_release(ptr %0) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy16_8(ptr %0, ptr %1, ptr %2) #6 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %0, ptr noundef nonnull align 8 dereferenceable(16) %1, i64 16, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations6ClientVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Client) #6 {
entry:
  %dest.boolForSetting.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.boolForSetting.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  tail call void @swift_release(ptr %0) #7
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedDeclarations6ClientVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Client) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i128, ptr %value, align 1
  %9 = trunc i128 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %11 = load i64, ptr %value, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations6ClientVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Client) #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %14, label %7

7:                                                ; preds = %5
  %8 = add nsw i32 %whichCase, -1
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i128
  store i128 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations6ClientVMa"(i64 %0) #16 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedDeclarations6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedDeclarations13InitialValuesVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %InitialValues) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %9, label %1

1:                                                ; preds = %entry
  %2 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %3 = load i8, ptr %2, align 1
  %4 = icmp eq i8 %3, 0
  br i1 %4, label %9, label %5

5:                                                ; preds = %1
  %6 = load i128, ptr %value, align 1
  %7 = trunc i128 %6 to i32
  %8 = add i32 %7, 1
  br label %9

9:                                                ; preds = %entry, %1, %5
  %10 = phi i32 [ %8, %5 ], [ 0, %1 ], [ 0, %entry ]
  ret i32 %10
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations13InitialValuesVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %InitialValues) #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %.not = icmp eq i32 %numEmptyCases, 0
  %1 = icmp eq i32 %whichCase, 0
  br i1 %1, label %2, label %3

2:                                                ; preds = %entry
  br i1 %.not, label %6, label %.sink.split

3:                                                ; preds = %entry
  %4 = add i32 %whichCase, -1
  %5 = zext i32 %4 to i128
  store i128 %5, ptr %value, align 8
  br i1 %.not, label %6, label %.sink.split

.sink.split:                                      ; preds = %3, %2
  %.sink = phi i8 [ 0, %2 ], [ 1, %3 ]
  store i8 %.sink, ptr %0, align 8
  br label %6

6:                                                ; preds = %.sink.split, %3, %2
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations13InitialValuesVMa"(i64 %0) #16 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s17OwnedDeclarations13InitialValuesVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations10DependencyVMi"(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 32) #7
  ret ptr %3
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s17OwnedDeclarations10DependencyVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %"Dependency<Value>") #4 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %2 = tail call ptr @swift_retain(ptr returned %0) #23
  ret ptr %1
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations10DependencyVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %"Dependency<Value>") #6 {
entry:
  %object.keyPath = getelementptr inbounds nuw i8, ptr %object, i64 16
  %toDestroy = load ptr, ptr %object.keyPath, align 8
  tail call void @swift_release(ptr %toDestroy) #7
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s17OwnedDeclarations10DependencyVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 41), (48, 65), (72, 80)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %"Dependency<Value>") #4 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %dest, ptr noundef nonnull align 8 dereferenceable(16) %src, i64 16, i1 false)
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %0 = load ptr, ptr %src.keyPath, align 8
  store ptr %0, ptr %dest.keyPath, align 8
  %dest.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.filePath, ptr noundef nonnull align 8 dereferenceable(17) %src.filePath, i64 17, i1 false)
  %dest.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.fileID, ptr noundef nonnull align 8 dereferenceable(17) %src.fileID, i64 17, i1 false)
  %dest.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %1 = load i64, ptr %src.line, align 8
  store i64 %1, ptr %dest.line, align 8
  %2 = tail call ptr @swift_retain(ptr returned %0) #23
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations10DependencyVwca"(ptr returned captures(ret: address, provenance) initializes((0, 16), (24, 41), (48, 65), (72, 80)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %"Dependency<Value>") #6 {
entry:
  %0 = load i64, ptr %src, align 8
  store i64 %0, ptr %dest, align 8
  %dest.initialValues.second = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.initialValues.second = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load i64, ptr %src.initialValues.second, align 8
  store i64 %1, ptr %dest.initialValues.second, align 8
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %2 = load ptr, ptr %src.keyPath, align 8
  %oldValue = load ptr, ptr %dest.keyPath, align 8
  store ptr %2, ptr %dest.keyPath, align 8
  %3 = tail call ptr @swift_retain(ptr returned %2) #23
  tail call void @swift_release(ptr %oldValue) #7
  %dest.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  %4 = load i64, ptr %src.filePath, align 8
  store i64 %4, ptr %dest.filePath, align 8
  %dest.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 32
  %5 = load i64, ptr %src.filePath._utf8CodeUnitCount, align 8
  store i64 %5, ptr %dest.filePath._utf8CodeUnitCount, align 8
  %dest.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 40
  %6 = load i8, ptr %src.filePath._flags, align 8
  store i8 %6, ptr %dest.filePath._flags, align 8
  %dest.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  %7 = load i64, ptr %src.fileID, align 8
  store i64 %7, ptr %dest.fileID, align 8
  %dest.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 56
  %src.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 56
  %8 = load i64, ptr %src.fileID._utf8CodeUnitCount, align 8
  store i64 %8, ptr %dest.fileID._utf8CodeUnitCount, align 8
  %dest.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 64
  %src.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 64
  %9 = load i8, ptr %src.fileID._flags, align 8
  store i8 %9, ptr %dest.fileID._flags, align 8
  %dest.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %10 = load i64, ptr %src.line, align 8
  store i64 %10, ptr %dest.line, align 8
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy80_8(ptr %0, ptr %1, ptr %2) #6 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(80) %0, ptr noundef nonnull align 8 dereferenceable(80) %1, i64 80, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations10DependencyVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 16), (24, 41), (48, 65), (72, 80)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %"Dependency<Value>") #6 {
entry:
  %0 = load <2 x i64>, ptr %src, align 8
  store <2 x i64> %0, ptr %dest, align 8
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %1 = load ptr, ptr %src.keyPath, align 8
  %oldValue = load ptr, ptr %dest.keyPath, align 8
  store ptr %1, ptr %dest.keyPath, align 8
  tail call void @swift_release(ptr %oldValue) #7
  %dest.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  %2 = load <2 x i64>, ptr %src.filePath, align 8
  store <2 x i64> %2, ptr %dest.filePath, align 8
  %dest.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 40
  %3 = load i8, ptr %src.filePath._flags, align 8
  store i8 %3, ptr %dest.filePath._flags, align 8
  %dest.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  %4 = load <2 x i64>, ptr %src.fileID, align 8
  store <2 x i64> %4, ptr %dest.fileID, align 8
  %dest.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 64
  %src.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 64
  %5 = load i8, ptr %src.fileID._flags, align 8
  store i8 %5, ptr %dest.fileID._flags, align 8
  %dest.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %6 = load i64, ptr %src.line, align 8
  store i64 %6, ptr %dest.line, align 8
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedDeclarations10DependencyVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %"Dependency<Value>") #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 80
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i640, ptr %value, align 1
  %9 = trunc i640 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %value.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 16
  %11 = load i64, ptr %value.keyPath, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations10DependencyVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 80
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %14, label %7

7:                                                ; preds = %5
  %8 = add nsw i32 %whichCase, -1
  %value.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 16
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value.keyPath, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i640
  store i640 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations10DependencyVMa"(i64 %0, ptr readnone %1) #17 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedDeclarations10DependencyVMn") #26
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
declare ptr @swift_allocateGenericValueMetadata(ptr, ptr, ptr, i64) local_unnamed_addr #7

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVMi"(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 16) #7
  ret ptr %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedDeclarations14GenericClosureVMr"(ptr %"GenericClosure<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #6 {
entry:
  %classFields = alloca [2 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 16, ptr nonnull %classFields)
  %2 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #27
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 24
  %8 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  %10 = getelementptr inbounds nuw i8, ptr %classFields, i64 8
  store ptr getelementptr inbounds nuw (i8, ptr @"$syycWV", i64 64), ptr %10, align 8
  call void @swift_initStructMetadata(ptr nonnull %"GenericClosure<Value>", i64 0, i64 2, ptr nonnull %classFields, ptr nonnull %7) #7
  call void @llvm.lifetime.end.p0(i64 16, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied, %entry
  %11 = phi ptr [ %4, %entry ], [ null, %dependency-satisfied ]
  %12 = phi i64 [ 63, %entry ], [ 0, %dependency-satisfied ]
  %13 = insertvalue %swift.metadata_response undef, ptr %11, 0
  %14 = insertvalue %swift.metadata_response %13, i64 %12, 1
  ret %swift.metadata_response %14
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %2, align 8, !invariant.load !17
  %3 = add i64 %size, 7
  %4 = and i64 %3, -8
  %size1 = add i64 %4, 16
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = icmp ult i64 %size1, 25
  %7 = and i32 %flags, 1048824
  %8 = icmp eq i32 %7, 0
  %9 = and i1 %8, %6
  br i1 %9, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %10 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %10, align 8, !invariant.load !17
  %11 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %12 = ptrtoint ptr %dest to i64
  %13 = ptrtoint ptr %src to i64
  %14 = add i64 %12, 7
  %15 = add i64 %14, %size
  %16 = and i64 %15, -8
  %17 = inttoptr i64 %16 to ptr
  %18 = add i64 %13, 7
  %19 = add i64 %18, %size
  %20 = and i64 %19, -8
  %21 = inttoptr i64 %20 to ptr
  %.data = getelementptr inbounds nuw i8, ptr %21, i64 8
  %22 = load ptr, ptr %.data, align 8
  %23 = load <2 x ptr>, ptr %21, align 8
  store <2 x ptr> %23, ptr %17, align 8
  br label %32

allocateBB:                                       ; preds = %entry
  %24 = and i32 %flags, 248
  %25 = or disjoint i32 %24, 7
  %26 = zext nneg i32 %25 to i64
  %27 = load ptr, ptr %src, align 8
  store ptr %27, ptr %dest, align 8
  %28 = add nuw nsw i64 %26, 16
  %29 = xor i64 %26, -1
  %30 = and i64 %28, %29
  %31 = getelementptr inbounds nuw i8, ptr %27, i64 %30
  br label %32

32:                                               ; preds = %allocateBB, %inlineBB
  %.sink = phi ptr [ %27, %allocateBB ], [ %22, %inlineBB ]
  %33 = phi ptr [ %31, %allocateBB ], [ %dest, %inlineBB ]
  %34 = tail call ptr @swift_retain(ptr returned %.sink) #23
  ret ptr %33
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations14GenericClosureVwxx"(ptr noalias %object, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %Value) #7
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = ptrtoint ptr %object to i64
  %5 = add i64 %4, 7
  %6 = add i64 %5, %size
  %7 = and i64 %6, -8
  %8 = inttoptr i64 %7 to ptr
  %.data = getelementptr inbounds nuw i8, ptr %8, i64 8
  %9 = load ptr, ptr %.data, align 8
  tail call void @swift_release(ptr %9) #7
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = add i64 %size, 7
  %8 = add i64 %7, %5
  %9 = and i64 %8, -8
  %10 = inttoptr i64 %9 to ptr
  %11 = add i64 %7, %6
  %12 = and i64 %11, -8
  %13 = inttoptr i64 %12 to ptr
  %.data = getelementptr inbounds nuw i8, ptr %13, i64 8
  %14 = load ptr, ptr %.data, align 8
  %15 = load <2 x ptr>, ptr %13, align 8
  store <2 x ptr> %15, ptr %10, align 8
  %16 = tail call ptr @swift_retain(ptr returned %14) #23
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %Value) #7
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = add i64 %size, 7
  %8 = add i64 %7, %5
  %9 = and i64 %8, -8
  %10 = inttoptr i64 %9 to ptr
  %11 = add i64 %7, %6
  %12 = and i64 %11, -8
  %13 = inttoptr i64 %12 to ptr
  %.data = getelementptr inbounds nuw i8, ptr %13, i64 8
  %.data2 = getelementptr inbounds nuw i8, ptr %10, i64 8
  %14 = load ptr, ptr %.data2, align 8
  %15 = load ptr, ptr %.data, align 8
  %16 = load <2 x ptr>, ptr %13, align 8
  store <2 x ptr> %16, ptr %10, align 8
  %17 = tail call ptr @swift_retain(ptr returned %15) #23
  tail call void @swift_release(ptr %14) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = add i64 %size, 7
  %8 = add i64 %7, %5
  %9 = and i64 %8, -8
  %10 = inttoptr i64 %9 to ptr
  %11 = add i64 %7, %6
  %12 = and i64 %11, -8
  %13 = inttoptr i64 %12 to ptr
  %14 = load <2 x ptr>, ptr %13, align 8
  store <2 x ptr> %14, ptr %10, align 8
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations14GenericClosureVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = add i64 %size, 7
  %8 = add i64 %7, %5
  %9 = and i64 %8, -8
  %10 = inttoptr i64 %9 to ptr
  %11 = add i64 %7, %6
  %12 = and i64 %11, -8
  %13 = inttoptr i64 %12 to ptr
  %.data2 = getelementptr inbounds nuw i8, ptr %10, i64 8
  %14 = load ptr, ptr %.data2, align 8
  %15 = load <2 x ptr>, ptr %13, align 8
  store <2 x ptr> %15, ptr %10, align 8
  tail call void @swift_release(ptr %14) #7
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedDeclarations14GenericClosureVwet"(ptr noalias %value, i32 %numEmptyCases, ptr readonly captures(none) %"GenericClosure<Value>") #18 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount, i32 2147483647)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = add i64 %size, 7
  %5 = and i64 %4, -8
  %size1 = add i64 %5, 16
  %6 = icmp eq i32 %numEmptyCases, 0
  br i1 %6, label %found_max_xi, label %7

7:                                                ; preds = %entry
  %8 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %8, label %9, label %.thread

9:                                                ; preds = %7
  %10 = and i64 %size1, 4294967288
  %.not = icmp eq i64 %10, 0
  %11 = add nsw i32 %numEmptyCases, 1
  %12 = sub i32 %11, %num-extra-inhabitants
  %num-tags-phi = select i1 %.not, i32 %12, i32 2
  %13 = icmp ult i32 %num-tags-phi, 2
  %14 = icmp ult i32 %num-tags-phi, 256
  %15 = icmp ult i32 %num-tags-phi, 65536
  %16 = select i1 %15, i32 2, i32 4
  %17 = select i1 %14, i32 1, i32 %16
  %num-tag-bytes = select i1 %13, i32 0, i32 %17
  %18 = getelementptr inbounds i8, ptr %value, i64 %size1
  switch i32 %num-tag-bytes, label %27 [
    i32 0, label %.thread
    i32 1, label %19
    i32 2, label %22
    i32 4, label %25
  ]

19:                                               ; preds = %9
  %20 = load i8, ptr %18, align 1
  %21 = zext i8 %20 to i32
  br label %28

22:                                               ; preds = %9
  %23 = load i16, ptr %18, align 1
  %24 = zext i16 %23 to i32
  br label %28

25:                                               ; preds = %9
  %26 = load i32, ptr %18, align 1
  br label %28

27:                                               ; preds = %9
  unreachable

28:                                               ; preds = %25, %22, %19
  %29 = phi i32 [ %21, %19 ], [ %24, %22 ], [ %26, %25 ]
  %30 = icmp eq i32 %29, 0
  br i1 %30, label %.thread, label %31

31:                                               ; preds = %28
  %32 = add i32 %29, -1
  %33 = select i1 %.not, i32 %32, i32 0
  br i1 %.not, label %36, label %34

34:                                               ; preds = %31
  %35 = load i32, ptr %value, align 8
  br label %36

36:                                               ; preds = %34, %31
  %37 = phi i32 [ 0, %31 ], [ %35, %34 ]
  %38 = or i32 %37, %33
  %39 = add nuw i32 %num-extra-inhabitants, 1
  %40 = add i32 %39, %38
  br label %found_max_xi

.thread:                                          ; preds = %9, %7, %28
  %41 = icmp ugt i32 %extraInhabitantCount, 2147483646
  br i1 %41, label %42, label %is-valid-pointer

42:                                               ; preds = %.thread
  %43 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %43, align 8, !invariant.load !17
  %44 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %Value) #25
  br label %found_max_xi

is-valid-pointer:                                 ; preds = %.thread
  %45 = ptrtoint ptr %value to i64
  %46 = add i64 %45, 7
  %47 = add i64 %46, %size
  %48 = and i64 %47, -8
  %49 = inttoptr i64 %48 to ptr
  %50 = load i64, ptr %49, align 8
  %spec.select7 = tail call i64 @llvm.umin.i64(i64 %50, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select7 to i32
  %51 = add i32 %spec.select, 1
  br label %found_max_xi

found_max_xi:                                     ; preds = %entry, %is-valid-pointer, %42, %36
  %52 = phi i32 [ %40, %36 ], [ %44, %42 ], [ %51, %is-valid-pointer ], [ 0, %entry ]
  ret i32 %52
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations14GenericClosureVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"GenericClosure<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericClosure<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount, i32 2147483647)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = add i64 %size, 7
  %5 = and i64 %4, -8
  %size1 = add i64 %5, 16
  %6 = trunc i64 %size1 to i32
  %7 = getelementptr inbounds i8, ptr %value, i64 %size1
  %8 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %8, label %9, label %17

9:                                                ; preds = %entry
  %.not = icmp eq i32 %6, 0
  %10 = add nsw i32 %numEmptyCases, 1
  %11 = sub i32 %10, %num-extra-inhabitants
  %num-tags-phi = select i1 %.not, i32 %11, i32 2
  %12 = icmp ult i32 %num-tags-phi, 2
  %13 = icmp ult i32 %num-tags-phi, 256
  %14 = icmp ult i32 %num-tags-phi, 65536
  %15 = select i1 %14, i32 2, i32 4
  %16 = select i1 %13, i32 1, i32 %15
  %num-tag-bytes = select i1 %12, i32 0, i32 %16
  br label %17

17:                                               ; preds = %9, %entry
  %18 = phi i32 [ 0, %entry ], [ %num-tag-bytes, %9 ]
  %.not4 = icmp ugt i32 %whichCase, %num-extra-inhabitants
  br i1 %.not4, label %42, label %19

19:                                               ; preds = %17
  switch i32 %18, label %23 [
    i32 0, label %24
    i32 1, label %20
    i32 2, label %21
    i32 4, label %22
  ]

20:                                               ; preds = %19
  store i8 0, ptr %7, align 1
  br label %24

21:                                               ; preds = %19
  store i16 0, ptr %7, align 1
  br label %24

22:                                               ; preds = %19
  store i32 0, ptr %7, align 1
  br label %24

23:                                               ; preds = %19
  unreachable

24:                                               ; preds = %19, %22, %21, %20
  %.not7 = icmp eq i32 %whichCase, 0
  br i1 %.not7, label %found_max_xi, label %25

25:                                               ; preds = %24
  %26 = icmp ugt i32 %extraInhabitantCount, 2147483646
  br i1 %26, label %27, label %29

27:                                               ; preds = %25
  %28 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %28, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %Value) #7
  br label %found_max_xi

29:                                               ; preds = %25
  %30 = ptrtoint ptr %value to i64
  %31 = add i64 %30, 7
  %32 = add i64 %31, %size
  %33 = and i64 %32, -8
  %34 = inttoptr i64 %33 to ptr
  %35 = icmp sgt i32 %whichCase, -1
  br i1 %35, label %36, label %39

36:                                               ; preds = %29
  %37 = add nsw i32 %whichCase, -1
  %38 = zext nneg i32 %37 to i64
  store i64 %38, ptr %34, align 8
  br label %found_max_xi

39:                                               ; preds = %29
  %40 = and i32 %whichCase, 2147483647
  %41 = zext nneg i32 %40 to i128
  store i128 %41, ptr %34, align 8
  br label %found_max_xi

42:                                               ; preds = %17
  %.not5 = icmp eq i32 %6, 0
  %43 = sub nuw i32 %whichCase, %num-extra-inhabitants
  %spec.select = select i1 %.not5, i32 %43, i32 1
  br i1 %.not5, label %47, label %44

44:                                               ; preds = %42
  %45 = xor i32 %num-extra-inhabitants, -1
  %46 = add i32 %whichCase, %45
  tail call void @llvm.memset.p0.i32(ptr align 8 %value, i8 0, i32 %6, i1 false)
  store i32 %46, ptr %value, align 8
  br label %47

47:                                               ; preds = %44, %42
  switch i32 %18, label %53 [
    i32 0, label %found_max_xi
    i32 1, label %48
    i32 2, label %50
    i32 4, label %52
  ]

48:                                               ; preds = %47
  %49 = trunc i32 %spec.select to i8
  store i8 %49, ptr %7, align 1
  br label %found_max_xi

50:                                               ; preds = %47
  %51 = trunc i32 %spec.select to i16
  store i16 %51, ptr %7, align 1
  br label %found_max_xi

52:                                               ; preds = %47
  store i32 %spec.select, ptr %7, align 1
  br label %found_max_xi

53:                                               ; preds = %47
  unreachable

found_max_xi:                                     ; preds = %39, %48, %50, %52, %47, %36, %27, %24
  ret void
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: write)
declare void @llvm.memset.p0.i32(ptr writeonly captures(none), i8, i32, i1 immarg) #19

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations14GenericClosureVMa"(i64 %0, ptr readnone %1) #17 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedDeclarations14GenericClosureVMn") #26
  ret %swift.metadata_response %2
}

; Function Attrs: mustprogress nofree nounwind willreturn memory(read)
declare swiftcc %swift.metadata_response @swift_checkMetadataState(i64, ptr) local_unnamed_addr #20

; Function Attrs: nounwind
declare void @swift_initStructMetadata(ptr, i64, i64, ptr, ptr) local_unnamed_addr #7

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOMi"(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 8) #7
  ret ptr %3
}

; Function Attrs: mustprogress nounwind willreturn
define internal swiftcc %swift.metadata_response @"$s17OwnedDeclarations11GenericEnumOMr"(ptr %"GenericEnum<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #4 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #27
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  tail call void @swift_initEnumMetadataSinglePayload(ptr nonnull %"GenericEnum<Value>", i64 0, ptr nonnull %8, i32 1) #23
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied, %entry
  %9 = phi ptr [ %4, %entry ], [ null, %dependency-satisfied ]
  %10 = phi i64 [ 63, %entry ], [ 0, %dependency-satisfied ]
  %11 = insertvalue %swift.metadata_response undef, ptr %9, 0
  %12 = insertvalue %swift.metadata_response %11, i64 %10, 1
  ret %swift.metadata_response %12
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount, 0
  %4 = zext i1 %.not to i64
  %spec.select = add i64 %size, %4
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %7 = and i32 %flags, 1048576
  %flags.isBitwiseTakable = icmp eq i32 %7, 0
  %8 = icmp samesign ult i32 %6, 8
  %9 = icmp ult i64 %spec.select, 25
  %10 = and i1 %flags.isBitwiseTakable, %9
  %11 = and i1 %8, %10
  br i1 %11, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %12 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %12, align 8, !invariant.load !17
  %13 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %src, i32 1, ptr nonnull %Value) #25
  %14 = icmp eq i32 %13, 0
  br i1 %14, label %payloadBlock, label %noPayloadBlock

payloadBlock:                                     ; preds = %inlineBB
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %15, align 8, !invariant.load !17
  %16 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %17 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %17, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %dest, i32 0, i32 1, ptr nonnull %Value) #7
  br label %24

noPayloadBlock:                                   ; preds = %inlineBB
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 8 %dest, ptr align 8 %src, i64 %spec.select, i1 false)
  br label %24

allocateBB:                                       ; preds = %entry
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %18 = load ptr, ptr %src, align 8
  store ptr %18, ptr %dest, align 8
  %19 = add nuw nsw i64 %flags.alignmentMask, 16
  %20 = xor i64 %flags.alignmentMask, -1
  %21 = and i64 %19, %20
  %22 = getelementptr inbounds nuw i8, ptr %18, i64 %21
  %23 = tail call ptr @swift_retain(ptr returned %18) #23
  br label %24

24:                                               ; preds = %payloadBlock, %noPayloadBlock, %allocateBB
  %25 = phi ptr [ %22, %allocateBB ], [ %dest, %noPayloadBlock ], [ %dest, %payloadBlock ]
  ret ptr %25
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations11GenericEnumOwxx"(ptr noalias %object, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %object, i32 1, ptr %Value) #25
  %4 = icmp eq i32 %3, 0
  br i1 %4, label %payloadBlock, label %noPayloadBlock

payloadBlock:                                     ; preds = %entry
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %5, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr nonnull %Value) #7
  br label %noPayloadBlock

noPayloadBlock:                                   ; preds = %payloadBlock, %entry
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %src, i32 1, ptr %Value) #25
  %4 = icmp eq i32 %3, 0
  br i1 %4, label %payloadBlock, label %noPayloadBlock

payloadBlock:                                     ; preds = %entry
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %5, align 8, !invariant.load !17
  %6 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %7 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %7, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %dest, i32 0, i32 1, ptr nonnull %Value) #7
  br label %11

noPayloadBlock:                                   ; preds = %entry
  %8 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %8, align 4, !invariant.load !17
  %9 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %9, align 8, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount, 0
  %10 = zext i1 %.not to i64
  %spec.select = add i64 %size, %10
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select, i1 false)
  br label %11

11:                                               ; preds = %noPayloadBlock, %payloadBlock
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %dest, i32 1, ptr %Value) #25
  %4 = icmp eq i32 %3, 0
  %5 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %src, i32 1, ptr nonnull %Value) #25
  %6 = icmp eq i32 %5, 0
  br i1 %4, label %payloadBlock, label %noPayloadBlock3

payloadBlock:                                     ; preds = %entry
  br i1 %6, label %payloadBlock1, label %noPayloadBlock

payloadBlock1:                                    ; preds = %payloadBlock
  %7 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr nonnull %Value) #7
  br label %19

noPayloadBlock:                                   ; preds = %payloadBlock
  %9 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %9, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %dest, ptr nonnull %Value) #7
  %10 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %10, align 4, !invariant.load !17
  %11 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %11, align 8, !invariant.load !17
  %.not16 = icmp eq i32 %extraInhabitantCount, 0
  %12 = zext i1 %.not16 to i64
  %spec.select = add i64 %size, %12
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select, i1 false)
  br label %19

noPayloadBlock3:                                  ; preds = %entry
  br i1 %6, label %payloadBlock4, label %noPayloadBlock5

payloadBlock4:                                    ; preds = %noPayloadBlock3
  %13 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %13, align 8, !invariant.load !17
  %14 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %15, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %dest, i32 0, i32 1, ptr nonnull %Value) #7
  br label %19

noPayloadBlock5:                                  ; preds = %noPayloadBlock3
  %16 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount6 = load i32, ptr %16, align 4, !invariant.load !17
  %17 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size7 = load i64, ptr %17, align 8, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount6, 0
  %18 = zext i1 %.not to i64
  %spec.select18 = add i64 %size7, %18
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select18, i1 false)
  br label %19

19:                                               ; preds = %noPayloadBlock5, %payloadBlock4, %noPayloadBlock, %payloadBlock1
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %src, i32 1, ptr %Value) #25
  %4 = icmp eq i32 %3, 0
  br i1 %4, label %payloadBlock, label %noPayloadBlock

payloadBlock:                                     ; preds = %entry
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %5, align 8, !invariant.load !17
  %6 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %7 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %7, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %dest, i32 0, i32 1, ptr nonnull %Value) #7
  br label %11

noPayloadBlock:                                   ; preds = %entry
  %8 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %8, align 4, !invariant.load !17
  %9 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %9, align 8, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount, 0
  %10 = zext i1 %.not to i64
  %spec.select = add i64 %size, %10
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select, i1 false)
  br label %11

11:                                               ; preds = %noPayloadBlock, %payloadBlock
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations11GenericEnumOwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %dest, i32 1, ptr %Value) #25
  %4 = icmp eq i32 %3, 0
  %5 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %src, i32 1, ptr nonnull %Value) #25
  %6 = icmp eq i32 %5, 0
  br i1 %4, label %payloadBlock, label %noPayloadBlock3

payloadBlock:                                     ; preds = %entry
  br i1 %6, label %payloadBlock1, label %noPayloadBlock

payloadBlock1:                                    ; preds = %payloadBlock
  %7 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  br label %19

noPayloadBlock:                                   ; preds = %payloadBlock
  %9 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %9, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %dest, ptr nonnull %Value) #7
  %10 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %10, align 4, !invariant.load !17
  %11 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %11, align 8, !invariant.load !17
  %.not16 = icmp eq i32 %extraInhabitantCount, 0
  %12 = zext i1 %.not16 to i64
  %spec.select = add i64 %size, %12
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select, i1 false)
  br label %19

noPayloadBlock3:                                  ; preds = %entry
  br i1 %6, label %payloadBlock4, label %noPayloadBlock5

payloadBlock4:                                    ; preds = %noPayloadBlock3
  %13 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %13, align 8, !invariant.load !17
  %14 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %15, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %dest, i32 0, i32 1, ptr nonnull %Value) #7
  br label %19

noPayloadBlock5:                                  ; preds = %noPayloadBlock3
  %16 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount6 = load i32, ptr %16, align 4, !invariant.load !17
  %17 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size7 = load i64, ptr %17, align 8, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount6, 0
  %18 = zext i1 %.not to i64
  %spec.select18 = add i64 %size7, %18
  tail call void @llvm.memcpy.p0.p0.i64(ptr align 1 %dest, ptr align 1 %src, i64 %spec.select18, i1 false)
  br label %19

19:                                               ; preds = %noPayloadBlock5, %payloadBlock4, %noPayloadBlock, %payloadBlock1
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedDeclarations11GenericEnumOwet"(ptr noalias readonly %value, i32 %numEmptyCases, ptr readonly captures(none) %"GenericEnum<Value>") #18 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount, 0
  %num-extra-inhabitants = tail call i32 @llvm.usub.sat.i32(i32 %extraInhabitantCount, i32 1)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = zext i1 %.not to i64
  %spec.select = add i64 %size, %4
  %5 = trunc i64 %spec.select to i32
  %6 = icmp eq i32 %numEmptyCases, 0
  br i1 %6, label %62, label %7

7:                                                ; preds = %entry
  %8 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %8, label %9, label %.thread23

9:                                                ; preds = %7
  %10 = icmp ugt i32 %5, 3
  br i1 %10, label %.thread22, label %11

11:                                               ; preds = %9
  %12 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %13 = shl nuw nsw i32 %5, 3
  %notmask = shl nsw i32 -1, %13
  %14 = xor i32 %notmask, -1
  %15 = add i32 %12, %14
  %16 = lshr i32 %15, %13
  %.fr25 = freeze i32 %16
  %17 = add i32 %.fr25, 1
  %18 = icmp ult i32 %17, 256
  br i1 %18, label %.thread17, label %23

.thread17:                                        ; preds = %11
  %19 = icmp samesign ult i32 %17, 2
  br i1 %19, label %.thread23, label %.thread22

.thread22:                                        ; preds = %9, %.thread17
  %20 = getelementptr inbounds i8, ptr %value, i64 %spec.select
  %21 = load i8, ptr %20, align 1
  %22 = zext i8 %21 to i32
  br label %31

23:                                               ; preds = %11
  %24 = icmp ugt i32 %17, 65535
  %25 = getelementptr inbounds i8, ptr %value, i64 %spec.select
  br i1 %24, label %29, label %26

26:                                               ; preds = %23
  %27 = load i16, ptr %25, align 1
  %28 = zext i16 %27 to i32
  br label %31

29:                                               ; preds = %23
  %30 = load i32, ptr %25, align 1
  br label %31

31:                                               ; preds = %29, %26, %.thread22
  %32 = phi i32 [ %22, %.thread22 ], [ %28, %26 ], [ %30, %29 ]
  %33 = icmp eq i32 %32, 0
  br i1 %33, label %.thread23, label %34

34:                                               ; preds = %31
  %35 = add i32 %32, -1
  %36 = shl nuw nsw i32 %5, 3
  %37 = shl i32 %35, %36
  %38 = select i1 %10, i32 0, i32 %37
  %.not11 = icmp eq i32 %5, 0
  br i1 %.not11, label %53, label %39

39:                                               ; preds = %34
  %40 = select i1 %10, i32 4, i32 %5
  switch i32 %40, label %52 [
    i32 1, label %41
    i32 2, label %44
    i32 3, label %47
    i32 4, label %50
  ]

41:                                               ; preds = %39
  %42 = load i8, ptr %value, align 1
  %43 = zext i8 %42 to i32
  br label %53

44:                                               ; preds = %39
  %45 = load i16, ptr %value, align 1
  %46 = zext i16 %45 to i32
  br label %53

47:                                               ; preds = %39
  %48 = load i24, ptr %value, align 1
  %49 = zext i24 %48 to i32
  br label %53

50:                                               ; preds = %39
  %51 = load i32, ptr %value, align 1
  br label %53

52:                                               ; preds = %39
  unreachable

53:                                               ; preds = %41, %44, %47, %50, %34
  %54 = phi i32 [ 0, %34 ], [ %43, %41 ], [ %46, %44 ], [ %49, %47 ], [ %51, %50 ]
  %55 = or i32 %54, %38
  %56 = add nuw i32 %num-extra-inhabitants, 1
  %57 = add i32 %56, %55
  br label %62

.thread23:                                        ; preds = %.thread17, %31, %7
  %.not12 = icmp ult i32 %extraInhabitantCount, 2
  br i1 %.not12, label %62, label %58

58:                                               ; preds = %.thread23
  %59 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %59, align 8, !invariant.load !17
  %60 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %Value) #25
  %61 = tail call i32 @llvm.usub.sat.i32(i32 %60, i32 1)
  br label %62

62:                                               ; preds = %entry, %.thread23, %58, %53
  %63 = phi i32 [ %57, %53 ], [ 0, %.thread23 ], [ %61, %58 ], [ 0, %entry ]
  ret i32 %63
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations11GenericEnumOwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %.not = icmp eq i32 %extraInhabitantCount, 0
  %num-extra-inhabitants = tail call i32 @llvm.usub.sat.i32(i32 %extraInhabitantCount, i32 1)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = zext i1 %.not to i64
  %spec.select = add i64 %size, %4
  %5 = trunc i64 %spec.select to i32
  %6 = getelementptr inbounds i8, ptr %value, i64 %spec.select
  %7 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %7, label %8, label %.thread17.thread

8:                                                ; preds = %entry
  %9 = icmp ugt i32 %5, 3
  br i1 %9, label %.thread17.thread, label %10

10:                                               ; preds = %8
  %11 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %12 = shl nuw nsw i32 %5, 3
  %notmask = shl nsw i32 -1, %12
  %13 = xor i32 %notmask, -1
  %14 = add i32 %11, %13
  %15 = lshr i32 %14, %12
  %.fr25 = freeze i32 %15
  %16 = add i32 %.fr25, 1
  %17 = icmp ult i32 %16, 256
  %18 = icmp ult i32 %16, 65536
  %. = select i1 %18, i32 2, i32 4
  br i1 %17, label %.thread17, label %.thread17.thread

.thread17:                                        ; preds = %10
  %19 = icmp samesign ugt i32 %16, 1
  %spec.select26 = zext i1 %19 to i32
  br label %.thread17.thread

.thread17.thread:                                 ; preds = %.thread17, %10, %8, %entry
  %20 = phi i32 [ 0, %entry ], [ 1, %8 ], [ %., %10 ], [ %spec.select26, %.thread17 ]
  %.not10 = icmp ugt i32 %whichCase, %num-extra-inhabitants
  br i1 %.not10, label %32, label %21

21:                                               ; preds = %.thread17.thread
  switch i32 %20, label %25 [
    i32 0, label %26
    i32 1, label %22
    i32 2, label %23
    i32 4, label %24
  ]

22:                                               ; preds = %21
  store i8 0, ptr %6, align 1
  br label %26

23:                                               ; preds = %21
  store i16 0, ptr %6, align 1
  br label %26

24:                                               ; preds = %21
  store i32 0, ptr %6, align 1
  br label %26

25:                                               ; preds = %21
  unreachable

26:                                               ; preds = %21, %24, %23, %22
  %27 = icmp ne i32 %whichCase, 0
  %28 = icmp ugt i32 %extraInhabitantCount, 1
  %or.cond = and i1 %27, %28
  br i1 %or.cond, label %29, label %58

29:                                               ; preds = %26
  %30 = add nuw i32 %whichCase, 1
  %31 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %31, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %30, i32 %extraInhabitantCount, ptr nonnull %Value) #7
  br label %58

32:                                               ; preds = %.thread17.thread
  %33 = xor i32 %num-extra-inhabitants, -1
  %34 = add i32 %whichCase, %33
  %35 = icmp ugt i32 %5, 3
  br i1 %35, label %.thread23, label %36

.thread23:                                        ; preds = %32
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %5, i1 false)
  store i32 %34, ptr %value, align 1
  br label %50

36:                                               ; preds = %32
  %37 = shl nuw nsw i32 %5, 3
  %38 = lshr i32 %34, %37
  %39 = add i32 %38, 1
  %notmask11 = shl nsw i32 -1, %37
  %40 = xor i32 %notmask11, -1
  %41 = and i32 %34, %40
  %.not12 = icmp eq i32 %5, 0
  br i1 %.not12, label %50, label %42

42:                                               ; preds = %36
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %5, i1 false)
  switch i32 %5, label %49 [
    i32 1, label %43
    i32 2, label %45
    i32 3, label %47
  ]

43:                                               ; preds = %42
  %44 = trunc i32 %34 to i8
  store i8 %44, ptr %value, align 1
  br label %50

45:                                               ; preds = %42
  %46 = trunc i32 %41 to i16
  store i16 %46, ptr %value, align 1
  br label %50

47:                                               ; preds = %42
  %48 = trunc nuw i32 %41 to i24
  store i24 %48, ptr %value, align 1
  br label %50

49:                                               ; preds = %42
  unreachable

50:                                               ; preds = %43, %45, %47, %.thread23, %36
  %51 = phi i32 [ %39, %43 ], [ %39, %45 ], [ %39, %47 ], [ 1, %.thread23 ], [ %39, %36 ]
  switch i32 %20, label %57 [
    i32 0, label %58
    i32 1, label %52
    i32 2, label %54
    i32 4, label %56
  ]

52:                                               ; preds = %50
  %53 = trunc i32 %51 to i8
  store i8 %53, ptr %6, align 1
  br label %58

54:                                               ; preds = %50
  %55 = trunc i32 %51 to i16
  store i16 %55, ptr %6, align 1
  br label %58

56:                                               ; preds = %50
  store i32 %51, ptr %6, align 1
  br label %58

57:                                               ; preds = %50
  unreachable

58:                                               ; preds = %52, %54, %56, %50, %29, %26
  ret void
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedDeclarations11GenericEnumOwug"(ptr noalias readonly %value, ptr readonly captures(none) %"GenericEnum<Value>") #18 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 1, ptr %Value) #25
  ret i32 %3
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal void @"$s17OwnedDeclarations11GenericEnumOwup"(ptr noalias readnone captures(none) %value, ptr readnone captures(none) %"GenericEnum<Value>") #0 {
entry:
  ret void
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations11GenericEnumOwui"(ptr noalias %value, i32 %tag, ptr readonly captures(none) %"GenericEnum<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"GenericEnum<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %tag, i32 1, ptr %Value) #7
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations11GenericEnumOMa"(i64 %0, ptr readnone %1) #17 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedDeclarations11GenericEnumOMn") #26
  ret %swift.metadata_response %2
}

; Function Attrs: mustprogress nounwind willreturn
declare void @swift_initEnumMetadataSinglePayload(ptr, i64, ptr, i32) local_unnamed_addr #5

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations7ForeignOMa"(i64 %0) #16 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedDeclarations7ForeignOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedDeclarations7ForeignO10DependencyVMr"(ptr %"Foreign.Dependency<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #6 {
entry:
  %classFields = alloca [1 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 8, ptr nonnull %classFields)
  %2 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #27
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 24
  %8 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Foreign.Dependency<Value>", i64 0, i64 1, ptr nonnull %classFields, ptr nonnull %7) #7
  call void @llvm.lifetime.end.p0(i64 8, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied, %entry
  %10 = phi ptr [ %4, %entry ], [ null, %dependency-satisfied ]
  %11 = phi i64 [ 63, %entry ], [ 0, %dependency-satisfied ]
  %12 = insertvalue %swift.metadata_response undef, ptr %10, 0
  %13 = insertvalue %swift.metadata_response %12, i64 %11, 1
  ret %swift.metadata_response %13
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %3, align 8, !invariant.load !17
  %4 = and i32 %flags, 255
  %5 = and i32 %flags, 1048576
  %flags.isBitwiseTakable = icmp eq i32 %5, 0
  %6 = icmp samesign ult i32 %4, 8
  %7 = icmp ult i64 %size, 25
  %8 = and i1 %7, %flags.isBitwiseTakable
  %9 = and i1 %6, %8
  br i1 %9, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %10 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %10, align 8, !invariant.load !17
  %11 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Value) #7
  br label %18

allocateBB:                                       ; preds = %entry
  %alignment-mask = zext nneg i32 %4 to i64
  %12 = load ptr, ptr %src, align 8
  store ptr %12, ptr %dest, align 8
  %13 = add nuw nsw i64 %alignment-mask, 16
  %14 = xor i64 %alignment-mask, -1
  %15 = and i64 %13, %14
  %16 = getelementptr inbounds nuw i8, ptr %12, i64 %15
  %17 = tail call ptr @swift_retain(ptr returned %12) #23
  br label %18

18:                                               ; preds = %allocateBB, %inlineBB
  %19 = phi ptr [ %dest, %inlineBB ], [ %16, %allocateBB ]
  ret ptr %19
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations7ForeignO10DependencyVwxx"(ptr noalias %object, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %Value) #7
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %Value) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #7
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedDeclarations7ForeignO10DependencyVwet"(ptr noalias readonly %value, i32 %numEmptyCases, ptr readonly captures(none) %"Foreign.Dependency<Value>") #18 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = trunc i64 %size to i32
  %5 = icmp eq i32 %numEmptyCases, 0
  br i1 %5, label %59, label %6

6:                                                ; preds = %entry
  %7 = icmp ugt i32 %numEmptyCases, %extraInhabitantCount
  br i1 %7, label %8, label %found_max_xi

8:                                                ; preds = %6
  %9 = icmp ugt i32 %4, 3
  br i1 %9, label %.thread14, label %10

10:                                               ; preds = %8
  %11 = sub i32 %numEmptyCases, %extraInhabitantCount
  %12 = shl nuw nsw i32 %4, 3
  %notmask = shl nsw i32 -1, %12
  %13 = xor i32 %notmask, -1
  %14 = add i32 %11, %13
  %15 = lshr i32 %14, %12
  %.fr19 = freeze i32 %15
  %16 = add i32 %.fr19, 1
  %17 = icmp ult i32 %16, 256
  br i1 %17, label %.thread9, label %22

.thread9:                                         ; preds = %10
  %18 = icmp samesign ult i32 %16, 2
  br i1 %18, label %.thread15, label %.thread14

.thread14:                                        ; preds = %8, %.thread9
  %19 = getelementptr inbounds i8, ptr %value, i64 %size
  %20 = load i8, ptr %19, align 1
  %21 = zext i8 %20 to i32
  br label %30

22:                                               ; preds = %10
  %23 = icmp ugt i32 %16, 65535
  %24 = getelementptr inbounds i8, ptr %value, i64 %size
  br i1 %23, label %28, label %25

25:                                               ; preds = %22
  %26 = load i16, ptr %24, align 1
  %27 = zext i16 %26 to i32
  br label %30

28:                                               ; preds = %22
  %29 = load i32, ptr %24, align 1
  br label %30

30:                                               ; preds = %28, %25, %.thread14
  %31 = phi i32 [ %21, %.thread14 ], [ %27, %25 ], [ %29, %28 ]
  %32 = icmp eq i32 %31, 0
  br i1 %32, label %.thread15, label %33

33:                                               ; preds = %30
  %34 = add i32 %31, -1
  %35 = shl nuw nsw i32 %4, 3
  %36 = shl i32 %34, %35
  %37 = select i1 %9, i32 0, i32 %36
  %.not = icmp eq i32 %4, 0
  br i1 %.not, label %52, label %38

38:                                               ; preds = %33
  %39 = select i1 %9, i32 4, i32 %4
  switch i32 %39, label %51 [
    i32 1, label %40
    i32 2, label %43
    i32 3, label %46
    i32 4, label %49
  ]

40:                                               ; preds = %38
  %41 = load i8, ptr %value, align 1
  %42 = zext i8 %41 to i32
  br label %52

43:                                               ; preds = %38
  %44 = load i16, ptr %value, align 1
  %45 = zext i16 %44 to i32
  br label %52

46:                                               ; preds = %38
  %47 = load i24, ptr %value, align 1
  %48 = zext i24 %47 to i32
  br label %52

49:                                               ; preds = %38
  %50 = load i32, ptr %value, align 1
  br label %52

51:                                               ; preds = %38
  unreachable

52:                                               ; preds = %40, %43, %46, %49, %33
  %53 = phi i32 [ 0, %33 ], [ %42, %40 ], [ %45, %43 ], [ %48, %46 ], [ %50, %49 ]
  %54 = or i32 %53, %37
  %55 = add nuw i32 %extraInhabitantCount, 1
  %56 = add i32 %55, %54
  br label %59

.thread15:                                        ; preds = %.thread9, %30
  %.not4 = icmp eq i32 %extraInhabitantCount, 0
  br i1 %.not4, label %59, label %found_max_xi

found_max_xi:                                     ; preds = %6, %.thread15
  %57 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %57, align 8, !invariant.load !17
  %58 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %Value) #25
  br label %59

59:                                               ; preds = %entry, %.thread15, %found_max_xi, %52
  %60 = phi i32 [ %56, %52 ], [ 0, %.thread15 ], [ %58, %found_max_xi ], [ 0, %entry ]
  ret i32 %60
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations7ForeignO10DependencyVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Foreign.Dependency<Value>") #6 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Foreign.Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = trunc i64 %size to i32
  %5 = getelementptr inbounds i8, ptr %value, i64 %size
  %6 = icmp ugt i32 %numEmptyCases, %extraInhabitantCount
  br i1 %6, label %7, label %.thread9.thread

7:                                                ; preds = %entry
  %8 = icmp ugt i32 %4, 3
  br i1 %8, label %.thread9.thread, label %9

9:                                                ; preds = %7
  %10 = sub i32 %numEmptyCases, %extraInhabitantCount
  %11 = shl nuw nsw i32 %4, 3
  %notmask = shl nsw i32 -1, %11
  %12 = xor i32 %notmask, -1
  %13 = add i32 %10, %12
  %14 = lshr i32 %13, %11
  %.fr17 = freeze i32 %14
  %15 = add i32 %.fr17, 1
  %16 = icmp ult i32 %15, 256
  %17 = icmp ult i32 %15, 65536
  %. = select i1 %17, i32 2, i32 4
  br i1 %16, label %.thread9, label %.thread9.thread

.thread9:                                         ; preds = %9
  %18 = icmp samesign ugt i32 %15, 1
  %spec.select = zext i1 %18 to i32
  br label %.thread9.thread

.thread9.thread:                                  ; preds = %.thread9, %9, %7, %entry
  %19 = phi i32 [ 0, %entry ], [ 1, %7 ], [ %., %9 ], [ %spec.select, %.thread9 ]
  %.not = icmp ugt i32 %whichCase, %extraInhabitantCount
  br i1 %.not, label %27, label %20

20:                                               ; preds = %.thread9.thread
  switch i32 %19, label %24 [
    i32 0, label %25
    i32 1, label %21
    i32 2, label %22
    i32 4, label %23
  ]

21:                                               ; preds = %20
  store i8 0, ptr %5, align 1
  br label %25

22:                                               ; preds = %20
  store i16 0, ptr %5, align 1
  br label %25

23:                                               ; preds = %20
  store i32 0, ptr %5, align 1
  br label %25

24:                                               ; preds = %20
  unreachable

25:                                               ; preds = %20, %23, %22, %21
  %.not18 = icmp eq i32 %whichCase, 0
  br i1 %.not18, label %53, label %found_max_xi

found_max_xi:                                     ; preds = %25
  %26 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %26, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %Value) #7
  br label %53

27:                                               ; preds = %.thread9.thread
  %28 = xor i32 %extraInhabitantCount, -1
  %29 = add i32 %whichCase, %28
  %30 = icmp ugt i32 %4, 3
  br i1 %30, label %.thread15, label %31

.thread15:                                        ; preds = %27
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %4, i1 false)
  store i32 %29, ptr %value, align 1
  br label %45

31:                                               ; preds = %27
  %32 = shl nuw nsw i32 %4, 3
  %33 = lshr i32 %29, %32
  %34 = add i32 %33, 1
  %notmask3 = shl nsw i32 -1, %32
  %35 = xor i32 %notmask3, -1
  %36 = and i32 %29, %35
  %.not4 = icmp eq i32 %4, 0
  br i1 %.not4, label %45, label %37

37:                                               ; preds = %31
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %4, i1 false)
  switch i32 %4, label %44 [
    i32 1, label %38
    i32 2, label %40
    i32 3, label %42
  ]

38:                                               ; preds = %37
  %39 = trunc i32 %29 to i8
  store i8 %39, ptr %value, align 1
  br label %45

40:                                               ; preds = %37
  %41 = trunc i32 %36 to i16
  store i16 %41, ptr %value, align 1
  br label %45

42:                                               ; preds = %37
  %43 = trunc nuw i32 %36 to i24
  store i24 %43, ptr %value, align 1
  br label %45

44:                                               ; preds = %37
  unreachable

45:                                               ; preds = %38, %40, %42, %.thread15, %31
  %46 = phi i32 [ %34, %38 ], [ %34, %40 ], [ %34, %42 ], [ 1, %.thread15 ], [ %34, %31 ]
  switch i32 %19, label %52 [
    i32 0, label %53
    i32 1, label %47
    i32 2, label %49
    i32 4, label %51
  ]

47:                                               ; preds = %45
  %48 = trunc i32 %46 to i8
  store i8 %48, ptr %5, align 1
  br label %53

49:                                               ; preds = %45
  %50 = trunc i32 %46 to i16
  store i16 %50, ptr %5, align 1
  br label %53

51:                                               ; preds = %45
  store i32 %46, ptr %5, align 1
  br label %53

52:                                               ; preds = %45
  unreachable

53:                                               ; preds = %47, %49, %51, %45, %found_max_xi, %25
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations7ForeignO10DependencyVMa"(i64 %0, ptr readnone %1) #17 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedDeclarations7ForeignO10DependencyVMn") #26
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
define internal void @"$s17OwnedDeclarations4RootVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Root) #6 {
entry:
  %object.client.keyPath = getelementptr inbounds nuw i8, ptr %object, i64 16
  %toDestroy = load ptr, ptr %object.client.keyPath, align 8
  tail call void @swift_release(ptr %toDestroy) #7
  %object.scalar.keyPath = getelementptr inbounds nuw i8, ptr %object, i64 96
  %toDestroy1 = load ptr, ptr %object.scalar.keyPath, align 8
  tail call void @swift_release(ptr %toDestroy1) #7
  %object.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %object, i64 168
  %0 = load ptr, ptr %object.foreign.other.boolForSetting.data, align 8
  tail call void @swift_release(ptr %0) #7
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s17OwnedDeclarations4RootVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 41), (48, 65), (72, 121), (128, 145), (152, 176)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Root) #4 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %dest, ptr noundef nonnull align 8 dereferenceable(16) %src, i64 16, i1 false)
  %dest.client.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.client.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %0 = load ptr, ptr %src.client.keyPath, align 8
  store ptr %0, ptr %dest.client.keyPath, align 8
  %dest.client.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.client.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.client.filePath, ptr noundef nonnull align 8 dereferenceable(17) %src.client.filePath, i64 17, i1 false)
  %dest.client.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.client.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.client.fileID, ptr noundef nonnull align 8 dereferenceable(17) %src.client.fileID, i64 17, i1 false)
  %dest.client.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.client.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %1 = load i64, ptr %src.client.line, align 8
  store i64 %1, ptr %dest.client.line, align 8
  %dest.scalar = getelementptr inbounds nuw i8, ptr %dest, i64 80
  %src.scalar = getelementptr inbounds nuw i8, ptr %src, i64 80
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %dest.scalar, ptr noundef nonnull align 8 dereferenceable(16) %src.scalar, i64 16, i1 false)
  %dest.scalar.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 96
  %src.scalar.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 96
  %2 = load ptr, ptr %src.scalar.keyPath, align 8
  store ptr %2, ptr %dest.scalar.keyPath, align 8
  %dest.scalar.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 104
  %src.scalar.filePath = getelementptr inbounds nuw i8, ptr %src, i64 104
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.scalar.filePath, ptr noundef nonnull align 8 dereferenceable(17) %src.scalar.filePath, i64 17, i1 false)
  %dest.scalar.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 128
  %src.scalar.fileID = getelementptr inbounds nuw i8, ptr %src, i64 128
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(17) %dest.scalar.fileID, ptr noundef nonnull align 8 dereferenceable(17) %src.scalar.fileID, i64 17, i1 false)
  %dest.scalar.line = getelementptr inbounds nuw i8, ptr %dest, i64 152
  %src.scalar.line = getelementptr inbounds nuw i8, ptr %src, i64 152
  %3 = load i64, ptr %src.scalar.line, align 8
  store i64 %3, ptr %dest.scalar.line, align 8
  %dest.foreign = getelementptr inbounds nuw i8, ptr %dest, i64 160
  %src.foreign = getelementptr inbounds nuw i8, ptr %src, i64 160
  %src.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %src, i64 168
  %4 = load ptr, ptr %src.foreign.other.boolForSetting.data, align 8
  %5 = load <2 x ptr>, ptr %src.foreign, align 8
  store <2 x ptr> %5, ptr %dest.foreign, align 8
  %6 = tail call ptr @swift_retain(ptr returned %0) #23
  %7 = tail call ptr @swift_retain(ptr returned %2) #23
  %8 = tail call ptr @swift_retain(ptr returned %4) #23
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations4RootVwca"(ptr returned captures(ret: address, provenance) initializes((0, 16), (24, 41), (48, 65), (72, 96), (104, 121), (128, 145), (152, 168)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Root) #6 {
entry:
  %0 = load i64, ptr %src, align 8
  store i64 %0, ptr %dest, align 8
  %dest.client.initialValues.second = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.client.initialValues.second = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load i64, ptr %src.client.initialValues.second, align 8
  store i64 %1, ptr %dest.client.initialValues.second, align 8
  %dest.client.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.client.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %2 = load ptr, ptr %src.client.keyPath, align 8
  %oldValue = load ptr, ptr %dest.client.keyPath, align 8
  store ptr %2, ptr %dest.client.keyPath, align 8
  %3 = tail call ptr @swift_retain(ptr returned %2) #23
  tail call void @swift_release(ptr %oldValue) #7
  %dest.client.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.client.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  %4 = load i64, ptr %src.client.filePath, align 8
  store i64 %4, ptr %dest.client.filePath, align 8
  %dest.client.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.client.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 32
  %5 = load i64, ptr %src.client.filePath._utf8CodeUnitCount, align 8
  store i64 %5, ptr %dest.client.filePath._utf8CodeUnitCount, align 8
  %dest.client.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.client.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 40
  %6 = load i8, ptr %src.client.filePath._flags, align 8
  store i8 %6, ptr %dest.client.filePath._flags, align 8
  %dest.client.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.client.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  %7 = load i64, ptr %src.client.fileID, align 8
  store i64 %7, ptr %dest.client.fileID, align 8
  %dest.client.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 56
  %src.client.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 56
  %8 = load i64, ptr %src.client.fileID._utf8CodeUnitCount, align 8
  store i64 %8, ptr %dest.client.fileID._utf8CodeUnitCount, align 8
  %dest.client.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 64
  %src.client.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 64
  %9 = load i8, ptr %src.client.fileID._flags, align 8
  store i8 %9, ptr %dest.client.fileID._flags, align 8
  %dest.client.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.client.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %10 = load i64, ptr %src.client.line, align 8
  store i64 %10, ptr %dest.client.line, align 8
  %dest.scalar = getelementptr inbounds nuw i8, ptr %dest, i64 80
  %src.scalar = getelementptr inbounds nuw i8, ptr %src, i64 80
  %11 = load i64, ptr %src.scalar, align 8
  store i64 %11, ptr %dest.scalar, align 8
  %dest.scalar.initialValues.second = getelementptr inbounds nuw i8, ptr %dest, i64 88
  %src.scalar.initialValues.second = getelementptr inbounds nuw i8, ptr %src, i64 88
  %12 = load i64, ptr %src.scalar.initialValues.second, align 8
  store i64 %12, ptr %dest.scalar.initialValues.second, align 8
  %dest.scalar.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 96
  %src.scalar.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 96
  %13 = load ptr, ptr %src.scalar.keyPath, align 8
  %oldValue1 = load ptr, ptr %dest.scalar.keyPath, align 8
  store ptr %13, ptr %dest.scalar.keyPath, align 8
  %14 = tail call ptr @swift_retain(ptr returned %13) #23
  tail call void @swift_release(ptr %oldValue1) #7
  %dest.scalar.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 104
  %src.scalar.filePath = getelementptr inbounds nuw i8, ptr %src, i64 104
  %15 = load i64, ptr %src.scalar.filePath, align 8
  store i64 %15, ptr %dest.scalar.filePath, align 8
  %dest.scalar.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 112
  %src.scalar.filePath._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 112
  %16 = load i64, ptr %src.scalar.filePath._utf8CodeUnitCount, align 8
  store i64 %16, ptr %dest.scalar.filePath._utf8CodeUnitCount, align 8
  %dest.scalar.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 120
  %src.scalar.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 120
  %17 = load i8, ptr %src.scalar.filePath._flags, align 8
  store i8 %17, ptr %dest.scalar.filePath._flags, align 8
  %dest.scalar.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 128
  %src.scalar.fileID = getelementptr inbounds nuw i8, ptr %src, i64 128
  %18 = load i64, ptr %src.scalar.fileID, align 8
  store i64 %18, ptr %dest.scalar.fileID, align 8
  %dest.scalar.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %dest, i64 136
  %src.scalar.fileID._utf8CodeUnitCount = getelementptr inbounds nuw i8, ptr %src, i64 136
  %19 = load i64, ptr %src.scalar.fileID._utf8CodeUnitCount, align 8
  store i64 %19, ptr %dest.scalar.fileID._utf8CodeUnitCount, align 8
  %dest.scalar.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 144
  %src.scalar.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 144
  %20 = load i8, ptr %src.scalar.fileID._flags, align 8
  store i8 %20, ptr %dest.scalar.fileID._flags, align 8
  %dest.scalar.line = getelementptr inbounds nuw i8, ptr %dest, i64 152
  %src.scalar.line = getelementptr inbounds nuw i8, ptr %src, i64 152
  %21 = load i64, ptr %src.scalar.line, align 8
  store i64 %21, ptr %dest.scalar.line, align 8
  %dest.foreign = getelementptr inbounds nuw i8, ptr %dest, i64 160
  %src.foreign = getelementptr inbounds nuw i8, ptr %src, i64 160
  %src.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %src, i64 168
  %dest.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %dest, i64 168
  %22 = load ptr, ptr %dest.foreign.other.boolForSetting.data, align 8
  %23 = load ptr, ptr %src.foreign.other.boolForSetting.data, align 8
  %24 = load <2 x ptr>, ptr %src.foreign, align 8
  store <2 x ptr> %24, ptr %dest.foreign, align 8
  %25 = tail call ptr @swift_retain(ptr returned %23) #23
  tail call void @swift_release(ptr %22) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy176_8(ptr %0, ptr %1, ptr %2) #6 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(176) %0, ptr noundef nonnull align 8 dereferenceable(176) %1, i64 176, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s17OwnedDeclarations4RootVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 16), (24, 41), (48, 65), (72, 96), (104, 121), (128, 145), (152, 168)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Root) #6 {
entry:
  %0 = load <2 x i64>, ptr %src, align 8
  store <2 x i64> %0, ptr %dest, align 8
  %dest.client.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.client.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 16
  %1 = load ptr, ptr %src.client.keyPath, align 8
  %oldValue = load ptr, ptr %dest.client.keyPath, align 8
  store ptr %1, ptr %dest.client.keyPath, align 8
  tail call void @swift_release(ptr %oldValue) #7
  %dest.client.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.client.filePath = getelementptr inbounds nuw i8, ptr %src, i64 24
  %2 = load <2 x i64>, ptr %src.client.filePath, align 8
  store <2 x i64> %2, ptr %dest.client.filePath, align 8
  %dest.client.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.client.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 40
  %3 = load i8, ptr %src.client.filePath._flags, align 8
  store i8 %3, ptr %dest.client.filePath._flags, align 8
  %dest.client.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.client.fileID = getelementptr inbounds nuw i8, ptr %src, i64 48
  %4 = load <2 x i64>, ptr %src.client.fileID, align 8
  store <2 x i64> %4, ptr %dest.client.fileID, align 8
  %dest.client.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 64
  %src.client.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 64
  %5 = load i8, ptr %src.client.fileID._flags, align 8
  store i8 %5, ptr %dest.client.fileID._flags, align 8
  %dest.client.line = getelementptr inbounds nuw i8, ptr %dest, i64 72
  %src.client.line = getelementptr inbounds nuw i8, ptr %src, i64 72
  %6 = load <2 x i64>, ptr %src.client.line, align 8
  store <2 x i64> %6, ptr %dest.client.line, align 8
  %dest.scalar.initialValues.second = getelementptr inbounds nuw i8, ptr %dest, i64 88
  %src.scalar.initialValues.second = getelementptr inbounds nuw i8, ptr %src, i64 88
  %7 = load i64, ptr %src.scalar.initialValues.second, align 8
  store i64 %7, ptr %dest.scalar.initialValues.second, align 8
  %dest.scalar.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 96
  %src.scalar.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 96
  %8 = load ptr, ptr %src.scalar.keyPath, align 8
  %oldValue1 = load ptr, ptr %dest.scalar.keyPath, align 8
  store ptr %8, ptr %dest.scalar.keyPath, align 8
  tail call void @swift_release(ptr %oldValue1) #7
  %dest.scalar.filePath = getelementptr inbounds nuw i8, ptr %dest, i64 104
  %src.scalar.filePath = getelementptr inbounds nuw i8, ptr %src, i64 104
  %9 = load <2 x i64>, ptr %src.scalar.filePath, align 8
  store <2 x i64> %9, ptr %dest.scalar.filePath, align 8
  %dest.scalar.filePath._flags = getelementptr inbounds nuw i8, ptr %dest, i64 120
  %src.scalar.filePath._flags = getelementptr inbounds nuw i8, ptr %src, i64 120
  %10 = load i8, ptr %src.scalar.filePath._flags, align 8
  store i8 %10, ptr %dest.scalar.filePath._flags, align 8
  %dest.scalar.fileID = getelementptr inbounds nuw i8, ptr %dest, i64 128
  %src.scalar.fileID = getelementptr inbounds nuw i8, ptr %src, i64 128
  %11 = load <2 x i64>, ptr %src.scalar.fileID, align 8
  store <2 x i64> %11, ptr %dest.scalar.fileID, align 8
  %dest.scalar.fileID._flags = getelementptr inbounds nuw i8, ptr %dest, i64 144
  %src.scalar.fileID._flags = getelementptr inbounds nuw i8, ptr %src, i64 144
  %12 = load i8, ptr %src.scalar.fileID._flags, align 8
  store i8 %12, ptr %dest.scalar.fileID._flags, align 8
  %dest.scalar.line = getelementptr inbounds nuw i8, ptr %dest, i64 152
  %src.scalar.line = getelementptr inbounds nuw i8, ptr %src, i64 152
  %13 = load i64, ptr %src.scalar.line, align 8
  store i64 %13, ptr %dest.scalar.line, align 8
  %dest.foreign = getelementptr inbounds nuw i8, ptr %dest, i64 160
  %src.foreign = getelementptr inbounds nuw i8, ptr %src, i64 160
  %dest.foreign.other.boolForSetting.data = getelementptr inbounds nuw i8, ptr %dest, i64 168
  %14 = load ptr, ptr %dest.foreign.other.boolForSetting.data, align 8
  %15 = load <2 x ptr>, ptr %src.foreign, align 8
  store <2 x ptr> %15, ptr %dest.foreign, align 8
  tail call void @swift_release(ptr %14) #7
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedDeclarations4RootVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Root) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 176
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i1408, ptr %value, align 1
  %9 = trunc i1408 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %value.client.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 16
  %11 = load i64, ptr %value.client.keyPath, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedDeclarations4RootVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Root) #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 176
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %14, label %7

7:                                                ; preds = %5
  %8 = add nsw i32 %whichCase, -1
  %value.client.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 16
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value.client.keyPath, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i1408
  store i1408 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedDeclarations4RootVMa"(i64 %0) #16 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }>, ptr @"$s17OwnedDeclarations4RootVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline nounwind willreturn memory(read)
define linkonce_odr hidden swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr %3, ptr %4) local_unnamed_addr #11 {
entry:
  %generic.arguments = alloca [3 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 24, ptr nonnull %generic.arguments)
  store ptr %1, ptr %generic.arguments, align 8
  %5 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 8
  store ptr %2, ptr %5, align 8
  %6 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 16
  store ptr %3, ptr %6, align 8
  %7 = call swiftcc %swift.metadata_response @swift_getGenericMetadata(i64 %0, ptr nonnull %generic.arguments, ptr %4) #25
  ret %swift.metadata_response %7
}

; Function Attrs: nofree nounwind memory(read)
declare swiftcc %swift.metadata_response @swift_getGenericMetadata(i64, ptr, ptr) local_unnamed_addr #15

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i64 @llvm.umin.i64(i64, i64) #21

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i32 @llvm.umax.i32(i32, i32) #21

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i32 @llvm.usub.sat.i32(i32, i32) #21

define swiftcc void @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedDeclarations14GenericClosureV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedDeclarations7ForeignO10DependencyV5otherxvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedDeclarations14GenericClosureV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s17OwnedDeclarations4RootVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4 {
  %4 = tail call nonnull ptr @"$s17OwnedDeclarations10DependencyVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedDeclarations7ForeignO10DependencyVMi"(ptr %0, ptr %1, ptr %2) #6 {
  %4 = tail call ptr @"$s17OwnedDeclarations14GenericClosureVMi"(ptr %0, ptr %1, ptr %2) #6
  ret ptr %4
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s17OwnedDeclarations6ClientVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4 {
  %4 = tail call noundef ptr @"$s17OwnedDeclarations6ClientVwCP"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4
  ret ptr %4
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite) }
attributes #3 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #4 = { mustprogress nounwind willreturn "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #5 = { mustprogress nounwind willreturn }
attributes #6 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #7 = { nounwind }
attributes #8 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #9 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #10 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { mustprogress nofree noinline nounwind willreturn memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #12 = { nounwind memory(argmem: readwrite) }
attributes #13 = { nofree nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #14 = { nofree noinline nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #15 = { nofree nounwind memory(read) }
attributes #16 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #17 = { mustprogress nofree noinline nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #18 = { nofree nounwind memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #19 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: write) }
attributes #20 = { mustprogress nofree nounwind willreturn memory(read) }
attributes #21 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #22 = { noinline }
attributes #23 = { nounwind willreturn }
attributes #24 = { nounwind memory(argmem: read) }
attributes #25 = { nounwind memory(read) }
attributes #26 = { nounwind memory(none) }
attributes #27 = { nounwind willreturn memory(read) }

!llvm.module.flags = !{!0, !1, !2, !3, !4, !5, !6, !7, !8, !9, !10, !11}
!swift.module.flags = !{!12}
!llvm.linker.options = !{!13, !14, !15, !16}

!0 = !{i32 2, !"SDK Version", [2 x i32] [i32 26, i32 5]}
!1 = !{i32 1, !"Objective-C Version", i32 2}
!2 = !{i32 1, !"Objective-C Image Info Version", i32 0}
!3 = !{i32 1, !"Objective-C Image Info Section", !"__DATA,__objc_imageinfo,regular,no_dead_strip"}
!4 = !{i32 4, !"Objective-C Garbage Collection", i32 100861696}
!5 = !{i32 1, !"Objective-C Class Properties", i32 64}
!6 = !{i32 1, !"Objective-C Enforce ClassRO Pointer Signing", i8 0}
!7 = !{i32 1, !"wchar_size", i32 4}
!8 = !{i32 8, !"PIC Level", i32 2}
!9 = !{i32 7, !"uwtable", i32 1}
!10 = !{i32 7, !"frame-pointer", i32 1}
!11 = !{i32 1, !"Swift Version", i32 7}
!12 = !{!"standard-library", i1 false}
!13 = !{!"-lswift_Concurrency"}
!14 = !{!"-lswiftCore"}
!15 = !{!"-lswift_StringProcessing"}
!16 = !{!"-lobjc"}
!17 = !{}
!18 = !{i64 88}
