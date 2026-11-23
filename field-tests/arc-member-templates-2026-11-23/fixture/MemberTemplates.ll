; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-member-templates-2026-11-23/fixture/MemberTemplates.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-member-templates-2026-11-23/fixture/MemberTemplates.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_descriptor = type opaque
%swift.protocol = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i32, i32, i32, i32, i32, i32 }
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%swift.opaque = type opaque
%swift.metadata_response = type { ptr, i64 }

@"$s14OwnedTemplates6ValuesV4flagSbvpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$s14OwnedTemplates6ValuesVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s14OwnedTemplates6ValuesVwet", ptr @"$s14OwnedTemplates6ValuesVwst", i64 1, i64 1, i32 0, i32 254 }, align 8
@.str.14.OwnedTemplates = private constant [15 x i8] c"OwnedTemplates\00"
@"$s14OwnedTemplatesMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.14.OwnedTemplates to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s14OwnedTemplatesMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.6.Values = private constant [7 x i8] c"Values\00"
@"$s14OwnedTemplates6ValuesVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ValuesVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Values to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ValuesVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ValuesVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ValuesVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates6ValuesVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$s14OwnedTemplates6ValuesVWV", i64 512, ptr @"$s14OwnedTemplates6ValuesVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 14OwnedTemplates6ValuesV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates6ValuesV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Sb" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Sb", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [5 x i8] c"flag\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14OwnedTemplates6ValuesVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates6ValuesV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6ValuesVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6ValuesVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates6ClientVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s14OwnedTemplates6ClientVwet", ptr @"$s14OwnedTemplates6ClientVwst", i64 1, i64 1, i32 0, i32 254 }, align 8
@.str.6.Client = private constant [7 x i8] c"Client\00"
@"$s14OwnedTemplates6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$s14OwnedTemplates6ClientVWV", i64 512, ptr @"$s14OwnedTemplates6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 14OwnedTemplates6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates6ClientV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates10DependencyVWV" = internal constant %swift.vwtable { ptr @"$s14OwnedTemplates10DependencyVwCP", ptr @"$s14OwnedTemplates10DependencyVwxx", ptr @"$s14OwnedTemplates10DependencyVwcp", ptr @"$s14OwnedTemplates10DependencyVwca", ptr @"$s14OwnedTemplates10DependencyVwtk", ptr @"$s14OwnedTemplates10DependencyVwta", ptr @"$s14OwnedTemplates10DependencyVwet", ptr @"$s14OwnedTemplates10DependencyVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.10.Dependency = private constant [11 x i8] c"Dependency\00"
@"$s14OwnedTemplates10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$sBoWV" = external global ptr, align 8
@"$s14OwnedTemplates10DependencyVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates10DependencyVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates10DependencyVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 14OwnedTemplates10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$ss7KeyPathCMn" = external global %swift.type_descriptor, align 4
@"got.$ss7KeyPathCMn" = private unnamed_addr constant ptr @"$ss7KeyPathCMn"
@"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates6ValuesV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates6ValuesV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates6ValuesV", i32 0, i32 4) to i64)) to i32), [2 x i8] c"xG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@1 = private constant [8 x i8] c"keyPath\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic x" = linkonce_odr hidden constant <{ [1 x i8], i8 }> <{ [1 x i8] c"x", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@2 = private constant [6 x i8] c"value\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14OwnedTemplates10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates10DependencyV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates6ValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates10DependencyVMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates10DependencyVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates10DependencyVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates3TwoVWV" = internal constant %swift.vwtable { ptr @"$s14OwnedTemplates3TwoVwCP", ptr @"$s14OwnedTemplates3TwoVwxx", ptr @"$s14OwnedTemplates3TwoVwcp", ptr @"$s14OwnedTemplates3TwoVwca", ptr @"$s14OwnedTemplates3TwoVwtk", ptr @"$s14OwnedTemplates3TwoVwta", ptr @"$s14OwnedTemplates3TwoVwet", ptr @"$s14OwnedTemplates3TwoVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.3.Two = private constant [4 x i8] c"Two\00"
@"$s14OwnedTemplates3TwoVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates3TwoVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.3.Two to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 4) to i64)) to i32), i32 3, i32 4, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates3TwoVMn", i32 0, i32 8) to i64)) to i32), i16 2, i16 0, i16 2, i16 0, i8 -128, i8 -128, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates3TwoVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates3TwoVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates3TwoVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 14OwnedTemplates3TwoV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates3TwoV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@3 = private constant [6 x i8] c"first\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic q_" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"q_", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@4 = private constant [7 x i8] c"second\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____yxq_G s7KeyPathC" = linkonce_odr hidden constant <{ i8, i32, [5 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [5 x i8], i8 }>, ptr @"symbolic _____yxq_G s7KeyPathC", i32 0, i32 1) to i64)) to i32), [5 x i8] c"yxq_G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates3TwoVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates3TwoV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 3, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic q_" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 10) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____yxq_G s7KeyPathC" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates3TwoVMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates5ThreeVWV" = internal constant %swift.vwtable { ptr @"$s14OwnedTemplates5ThreeVwCP", ptr @"$s14OwnedTemplates5ThreeVwxx", ptr @"$s14OwnedTemplates5ThreeVwcp", ptr @"$s14OwnedTemplates5ThreeVwca", ptr @"$s14OwnedTemplates5ThreeVwtk", ptr @"$s14OwnedTemplates5ThreeVwta", ptr @"$s14OwnedTemplates5ThreeVwet", ptr @"$s14OwnedTemplates5ThreeVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.5.Three = private constant [6 x i8] c"Three\00"
@"$s14OwnedTemplates5ThreeVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates5ThreeVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.5.Three to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 5, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates5ThreeVMn", i32 0, i32 8) to i64)) to i32), i16 3, i16 0, i16 3, i16 0, i8 -128, i8 -128, i8 -128, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates5ThreeVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates5ThreeVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates5ThreeVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 14OwnedTemplates5ThreeV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates5ThreeV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic q0_" = linkonce_odr hidden constant <{ [3 x i8], i8 }> <{ [3 x i8] c"q0_", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates5ThreeVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates5ThreeV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic q0_" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates5ThreeVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates5ThreeVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"got.$sBoWV" = private unnamed_addr constant ptr @"$sBoWV"
@5 = internal constant <{ i32, [4 x i8] }> zeroinitializer, align 8
@.str.11.Constrained = private constant [12 x i8] c"Constrained\00"
@"$s14OwnedTemplates11ConstrainedVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$sSQMp" = external global %swift.protocol, align 4
@"got.$sSQMp" = private unnamed_addr constant ptr @"$sSQMp"
@"$s14OwnedTemplates11ConstrainedVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.11.Constrained to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 4, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 1, i16 2, i16 0, i8 -128, i8 0, i8 0, i8 0, i32 128, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 18) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQMp" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s14OwnedTemplates11ConstrainedVMn", i32 0, i32 19) to i64)) to i32), i32 1) }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates11ConstrainedVMP" = internal constant <{ i32, i32, i32, i32, i32, i16, i16 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMP" to i64)) to i32), i32 0, i32 1073741825, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sBoWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates11ConstrainedVMP", i32 0, i32 3) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @5 to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates11ConstrainedVMP", i32 0, i32 4) to i64)) to i32), i16 2, i16 1 }>, align 8
@"symbolic _____ 14OwnedTemplates11ConstrainedV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates11ConstrainedV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates11ConstrainedVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates11ConstrainedV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates6ValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates11ConstrainedVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates11ConstrainedVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sytWV" = external global ptr, align 8
@.str.7.Foreign = private constant [8 x i8] c"Foreign\00"
@"$s14OwnedTemplates7ForeignOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Foreign to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates7ForeignOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$sytWV", i64 513, ptr @"$s14OwnedTemplates7ForeignOMn" }>, align 8
@"symbolic _____ 14OwnedTemplates7ForeignO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates7ForeignO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates7ForeignOMF" = internal constant { i32, i32, i16, i16, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates7ForeignO" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 0 }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sBi64_WV" = external global ptr, align 8
@"$s14OwnedTemplates7ForeignO6ValuesVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Values to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates7ForeignO6ValuesVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$sBi64_WV", i64 512, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 14OwnedTemplates7ForeignO6ValuesV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates7ForeignO6ValuesV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Su" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Su", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@6 = private constant [7 x i8] c"number\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14OwnedTemplates7ForeignO6ValuesVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates7ForeignO6ValuesV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @6 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@7 = internal constant <{ i32, [4 x i8] }> zeroinitializer, align 8
@"$s14OwnedTemplates7ForeignO10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates7ForeignO10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates7ForeignO10DependencyVMP" = internal constant <{ i32, i32, i32, i32, i32, i16, i16 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMP" to i64)) to i32), i32 0, i32 1073741825, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sBoWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMP", i32 0, i32 3) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @7 to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMP", i32 0, i32 4) to i64)) to i32), i16 1, i16 1 }>, align 8
@"symbolic _____ 14OwnedTemplates7ForeignO10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates7ForeignO10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates7ForeignO6ValuesV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates7ForeignO6ValuesV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates7ForeignO6ValuesV", i32 0, i32 4) to i64)) to i32), [2 x i8] c"xG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates7ForeignO10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates7ForeignO10DependencyV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____xG s7KeyPathC 14OwnedTemplates7ForeignO6ValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates7ForeignO10DependencyVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"got.$sytWV" = private unnamed_addr constant ptr @"$sytWV"
@.str.6.Nested = private constant [7 x i8] c"Nested\00"
@"$s14OwnedTemplates6NestedVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates6NestedVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Nested to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates6NestedVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMP" to i64)) to i32), i32 0, i32 1073741824, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sytWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates6NestedVMP", i32 0, i32 3) to i64)) to i32), i32 1) }>, align 8
@"symbolic _____ 14OwnedTemplates6NestedV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates6NestedV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates6NestedVMF" = internal constant { i32, i32, i16, i16, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates6NestedV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 0 }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@8 = internal constant <{ i32, [4 x i8] }> zeroinitializer, align 8
@.str.5.Inner = private constant [6 x i8] c"Inner\00"
@"$s14OwnedTemplates6NestedV5InnerVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s14OwnedTemplates6NestedV5InnerVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.5.Inner to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 4, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMn", i32 0, i32 8) to i64)) to i32), i16 2, i16 0, i16 2, i16 0, i8 -128, i8 -128, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates6NestedV5InnerVMP" = internal constant <{ i32, i32, i32, i32, i32, i16, i16 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMi" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMP" to i64)) to i32), i32 0, i32 1073741825, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sBoWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMP", i32 0, i32 3) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @8 to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s14OwnedTemplates6NestedV5InnerVMP", i32 0, i32 4) to i64)) to i32), i16 2, i16 1 }>, align 8
@"symbolic _____ 14OwnedTemplates6NestedV5InnerV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates6NestedV5InnerV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____yxqd__G s7KeyPathC" = linkonce_odr hidden constant <{ i8, i32, [7 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [7 x i8], i8 }>, ptr @"symbolic _____yxqd__G s7KeyPathC", i32 0, i32 1) to i64)) to i32), [7 x i8] c"yxqd__G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s14OwnedTemplates6NestedV5InnerVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates6NestedV5InnerV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____yxqd__G s7KeyPathC" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6NestedV5InnerVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates6NestedV5InnerVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates4RootVWV" = internal constant %swift.vwtable { ptr @"$s14OwnedTemplates4RootVwCP", ptr @"$s14OwnedTemplates4RootVwxx", ptr @"$s14OwnedTemplates4RootVwcp", ptr @"$s14OwnedTemplates4RootVwca", ptr @__swift_memcpy49_8, ptr @"$s14OwnedTemplates4RootVwta", ptr @"$s14OwnedTemplates4RootVwet", ptr @"$s14OwnedTemplates4RootVwst", i64 49, i64 56, i32 196615, i32 2147483647 }, align 8
@.str.4.Root = private constant [5 x i8] c"Root\00"
@"$s14OwnedTemplates4RootVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplatesMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.4.Root to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMn", i32 0, i32 4) to i64)) to i32), i32 4, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14OwnedTemplates4RootVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32, i32, i32 }> <{ ptr null, ptr @"$s14OwnedTemplates4RootVWV", i64 512, ptr @"$s14OwnedTemplates4RootVMn", i32 0, i32 16, i32 32, i32 48 }>, align 8
@"symbolic _____ 14OwnedTemplates4RootV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14OwnedTemplates4RootV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____y_____G 14OwnedTemplates10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 14OwnedTemplates10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 14OwnedTemplates10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@9 = private constant [9 x i8] c"selected\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____ySbG 14OwnedTemplates10DependencyV" = linkonce_odr hidden constant <{ i8, i32, [4 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8 }>, ptr @"symbolic _____ySbG 14OwnedTemplates10DependencyV", i32 0, i32 1) to i64)) to i32), [4 x i8] c"ySbG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@10 = private constant [6 x i8] c"other\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y__________G 14OwnedTemplates3TwoV AA6ValuesV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G 14OwnedTemplates3TwoV AA6ValuesV AA6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G 14OwnedTemplates3TwoV AA6ValuesV AA6ClientV", i32 0, i32 4) to i64)) to i32), i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G 14OwnedTemplates3TwoV AA6ValuesV AA6ClientV", i32 0, i32 6) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@11 = private constant [4 x i8] c"two\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____ySbSu_____G 14OwnedTemplates5ThreeV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [5 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [5 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____ySbSu_____G 14OwnedTemplates5ThreeV AA6ClientV", i32 0, i32 1) to i64)) to i32), [5 x i8] c"ySbSu", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [5 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____ySbSu_____G 14OwnedTemplates5ThreeV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@12 = private constant [6 x i8] c"three\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14OwnedTemplates4RootVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14OwnedTemplates4RootV" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 4, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 14OwnedTemplates10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @9 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbG 14OwnedTemplates10DependencyV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @10 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 10) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y__________G 14OwnedTemplates3TwoV AA6ValuesV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @11 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 13) to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbSu_____G 14OwnedTemplates5ThreeV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 15) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @12 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14OwnedTemplates4RootVMF", i32 0, i32 16) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates6ValuesVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6ValuesVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates3TwoVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates3TwoVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates5ThreeVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates5ThreeVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates11ConstrainedVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates11ConstrainedVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates7ForeignOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates7ForeignO6ValuesVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO6ValuesVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates7ForeignO10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates7ForeignO10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates6NestedVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates6NestedV5InnerVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates6NestedV5InnerVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14OwnedTemplates4RootVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVMn" to i64), i64 ptrtoint (ptr @"$s14OwnedTemplates4RootVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [77 x ptr] [ptr @"$s14OwnedTemplates10DependencyV5valuexvg", ptr @"$s14OwnedTemplates10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvg", ptr @"$s14OwnedTemplates10DependencyVHn", ptr @"$s14OwnedTemplates10DependencyVMF", ptr @"$s14OwnedTemplates10DependencyVMa", ptr @"$s14OwnedTemplates10DependencyVMn", ptr @"$s14OwnedTemplates11ConstrainedV7keyPaths03KeyE0CyAA6ValuesVxGvg", ptr @"$s14OwnedTemplates11ConstrainedVHn", ptr @"$s14OwnedTemplates11ConstrainedVMF", ptr @"$s14OwnedTemplates11ConstrainedVMa", ptr @"$s14OwnedTemplates11ConstrainedVMn", ptr @"$s14OwnedTemplates3TwoV5firstxvg", ptr @"$s14OwnedTemplates3TwoV6secondq_vg", ptr @"$s14OwnedTemplates3TwoV7keyPaths03KeyE0Cyxq_Gvg", ptr @"$s14OwnedTemplates3TwoVHn", ptr @"$s14OwnedTemplates3TwoVMF", ptr @"$s14OwnedTemplates3TwoVMa", ptr @"$s14OwnedTemplates3TwoVMn", ptr @"$s14OwnedTemplates4RootV3twoAA3TwoVyAA6ValuesVAA6ClientVGvg", ptr @"$s14OwnedTemplates4RootV5otherAA10DependencyVySbGvg", ptr @"$s14OwnedTemplates4RootV5threeAA5ThreeVySbSuAA6ClientVGvg", ptr @"$s14OwnedTemplates4RootV8selectedAA10DependencyVyAA6ClientVGvg", ptr @"$s14OwnedTemplates4RootVHn", ptr @"$s14OwnedTemplates4RootVMF", ptr @"$s14OwnedTemplates4RootVMa", ptr @"$s14OwnedTemplates4RootVMn", ptr @"$s14OwnedTemplates4RootVN", ptr @"$s14OwnedTemplates5ThreeV5valueq0_vg", ptr @"$s14OwnedTemplates5ThreeVHn", ptr @"$s14OwnedTemplates5ThreeVMF", ptr @"$s14OwnedTemplates5ThreeVMa", ptr @"$s14OwnedTemplates5ThreeVMn", ptr @"$s14OwnedTemplates6ClientV4flagSbvM", ptr @"$s14OwnedTemplates6ClientV4flagSbvg", ptr @"$s14OwnedTemplates6ClientV4flagSbvs", ptr @"$s14OwnedTemplates6ClientVHn", ptr @"$s14OwnedTemplates6ClientVMF", ptr @"$s14OwnedTemplates6ClientVMa", ptr @"$s14OwnedTemplates6ClientVMn", ptr @"$s14OwnedTemplates6ClientVN", ptr @"$s14OwnedTemplates6NestedV5InnerV7keyPaths03KeyF0Cyxqd__Gvg", ptr @"$s14OwnedTemplates6NestedV5InnerVHn", ptr @"$s14OwnedTemplates6NestedV5InnerVMF", ptr @"$s14OwnedTemplates6NestedV5InnerVMa", ptr @"$s14OwnedTemplates6NestedV5InnerVMn", ptr @"$s14OwnedTemplates6NestedVHn", ptr @"$s14OwnedTemplates6NestedVMF", ptr @"$s14OwnedTemplates6NestedVMa", ptr @"$s14OwnedTemplates6NestedVMn", ptr @"$s14OwnedTemplates6ValuesV4flagSbvM", ptr @"$s14OwnedTemplates6ValuesV4flagSbvg", ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV", ptr @"$s14OwnedTemplates6ValuesV4flagSbvs", ptr @"$s14OwnedTemplates6ValuesVHn", ptr @"$s14OwnedTemplates6ValuesVMF", ptr @"$s14OwnedTemplates6ValuesVMa", ptr @"$s14OwnedTemplates6ValuesVMn", ptr @"$s14OwnedTemplates6ValuesVN", ptr @"$s14OwnedTemplates7ForeignO10DependencyV7keyPaths03KeyF0CyAC6ValuesVxGvg", ptr @"$s14OwnedTemplates7ForeignO10DependencyVHn", ptr @"$s14OwnedTemplates7ForeignO10DependencyVMF", ptr @"$s14OwnedTemplates7ForeignO10DependencyVMa", ptr @"$s14OwnedTemplates7ForeignO10DependencyVMn", ptr @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvM", ptr @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvg", ptr @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvs", ptr @"$s14OwnedTemplates7ForeignO6ValuesVHn", ptr @"$s14OwnedTemplates7ForeignO6ValuesVMF", ptr @"$s14OwnedTemplates7ForeignO6ValuesVMa", ptr @"$s14OwnedTemplates7ForeignO6ValuesVMn", ptr @"$s14OwnedTemplates7ForeignO6ValuesVN", ptr @"$s14OwnedTemplates7ForeignOHn", ptr @"$s14OwnedTemplates7ForeignOMF", ptr @"$s14OwnedTemplates7ForeignOMa", ptr @"$s14OwnedTemplates7ForeignOMn", ptr @"$s14OwnedTemplates7ForeignON", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s14OwnedTemplates6ClientV4flagSbvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates10DependencyV5valuexvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates3TwoV5firstxvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates3TwoV6secondq_vpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates3TwoV7keyPaths03KeyE0Cyxq_GvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates5ThreeV5valueq0_vpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates11ConstrainedV7keyPaths03KeyE0CyAA6ValuesVxGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates7ForeignO10DependencyV7keyPaths03KeyF0CyAC6ValuesVxGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates6NestedV5InnerV7keyPaths03KeyF0Cyxqd__GvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates4RootV8selectedAA10DependencyVyAA6ClientVGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates4RootV5otherAA10DependencyVySbGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates4RootV3twoAA3TwoVyAA6ValuesVAA6ClientVGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates4RootV5threeAA5ThreeVySbSuAA6ClientVGvpMV" = alias { i32 }, ptr @"$s14OwnedTemplates6ValuesV4flagSbvpMV"
@"$s14OwnedTemplates6ValuesVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates6ValuesVMf", i32 0, i32 2)
@"$s14OwnedTemplates6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates6ClientVMf", i32 0, i32 2)
@"$s14OwnedTemplates7ForeignON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s14OwnedTemplates7ForeignOMf", i32 0, i32 2)
@"$s14OwnedTemplates7ForeignO6ValuesVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMf", i32 0, i32 2)
@"$s14OwnedTemplates4RootVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s14OwnedTemplates6ValuesV4flagSbvg"(i1 returned %0) #0 {
entry:
  ret i1 %0
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14OwnedTemplates6ValuesV4flagSbvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(1) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14OwnedTemplates6ValuesV4flagSbvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14OwnedTemplates6ValuesV4flagSbvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s14OwnedTemplates6ClientV4flagSbvg"(i1 returned %0) #0 {
entry:
  ret i1 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14OwnedTemplates6ClientV4flagSbvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(1) initializes((0, 1)) %1) #2 {
entry:
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %1, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14OwnedTemplates6ClientV4flagSbvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(1) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14OwnedTemplates6ClientV4flagSbvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14OwnedTemplates6ClientV4flagSbvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14OwnedTemplates10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvg"(ptr readnone captures(none) %"Dependency<Value>", ptr noalias readonly swiftself captures(none) %0) #3 {
entry:
  %1 = load ptr, ptr %0, align 8
  %2 = tail call ptr @swift_retain(ptr returned %1) #20
  ret ptr %1
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #4

define swiftcc void @"$s14OwnedTemplates10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Dependency<Value>", ptr noalias swiftself %1) #5 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 28
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %8, align 8, !invariant.load !17
  %9 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %5, ptr %Value) #11
  ret void
}

define swiftcc void @"$s14OwnedTemplates3TwoV5firstxvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Two<First, Second>", ptr noalias swiftself %1) #5 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %1, ptr %First) #11
  ret void
}

define swiftcc void @"$s14OwnedTemplates3TwoV6secondq_vg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Two<First, Second>", ptr noalias swiftself %1) #5 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 36
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %8, align 8, !invariant.load !17
  %9 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %5, ptr %Second) #11
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14OwnedTemplates3TwoV7keyPaths03KeyE0Cyxq_Gvg"(ptr readonly captures(none) %"Two<First, Second>", ptr noalias readonly swiftself captures(none) %0) #3 {
entry:
  %1 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 40
  %2 = load i32, ptr %1, align 8
  %3 = sext i32 %2 to i64
  %4 = getelementptr inbounds i8, ptr %0, i64 %3
  %5 = load ptr, ptr %4, align 8
  %6 = tail call ptr @swift_retain(ptr returned %5) #20
  ret ptr %5
}

define swiftcc void @"$s14OwnedTemplates5ThreeV5valueq0_vg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Three<First, Second, Third>", ptr noalias swiftself %1) #5 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %1, ptr %Third) #11
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14OwnedTemplates11ConstrainedV7keyPaths03KeyE0CyAA6ValuesVxGvg"(ptr returned %0, ptr readnone captures(none) %Value, ptr readnone captures(none) %Value.Equatable) #3 {
entry:
  %1 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvg"(i64 returned %0) #0 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #2 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(8) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14OwnedTemplates7ForeignO6ValuesV6numberSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14OwnedTemplates7ForeignO10DependencyV7keyPaths03KeyF0CyAC6ValuesVxGvg"(ptr returned %0, ptr readnone captures(none) %Value) #3 {
entry:
  %1 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %0
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, i1 } @"$s14OwnedTemplates4RootV8selectedAA10DependencyVyAA6ClientVGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(49) %0) #3 {
entry:
  %1 = load ptr, ptr %0, align 8
  %.selected.value = getelementptr inbounds nuw i8, ptr %0, i64 8
  %2 = load i1, ptr %.selected.value, align 8
  %3 = insertvalue { ptr, i1 } undef, ptr %1, 0
  %4 = insertvalue { ptr, i1 } %3, i1 %2, 1
  %5 = tail call ptr @swift_retain(ptr returned %1) #20
  ret { ptr, i1 } %4
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, i1 } @"$s14OwnedTemplates4RootV5otherAA10DependencyVySbGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(49) %0) #3 {
entry:
  %.other = getelementptr inbounds nuw i8, ptr %0, i64 16
  %1 = load ptr, ptr %.other, align 8
  %.other.value = getelementptr inbounds nuw i8, ptr %0, i64 24
  %2 = load i1, ptr %.other.value, align 8
  %3 = insertvalue { ptr, i1 } undef, ptr %1, 0
  %4 = insertvalue { ptr, i1 } %3, i1 %2, 1
  %5 = tail call ptr @swift_retain(ptr returned %1) #20
  ret { ptr, i1 } %4
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { i16, ptr } @"$s14OwnedTemplates4RootV3twoAA3TwoVyAA6ValuesVAA6ClientVGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(49) %0) #3 {
entry:
  %.two = getelementptr inbounds nuw i8, ptr %0, i64 32
  %1 = load i1, ptr %.two, align 8
  %.two.second = getelementptr inbounds nuw i8, ptr %0, i64 33
  %2 = load i1, ptr %.two.second, align 1
  %.two.keyPath = getelementptr inbounds nuw i8, ptr %0, i64 40
  %3 = load ptr, ptr %.two.keyPath, align 8
  %temp-coercion.coerced.sroa.0.0.insert.ext = zext i1 %1 to i16
  %temp-coercion.coerced.sroa.0.1.insert.shift = select i1 %2, i16 256, i16 0
  %temp-coercion.coerced.sroa.0.1.insert.insert = or disjoint i16 %temp-coercion.coerced.sroa.0.1.insert.shift, %temp-coercion.coerced.sroa.0.0.insert.ext
  %4 = insertvalue { i16, ptr } undef, i16 %temp-coercion.coerced.sroa.0.1.insert.insert, 0
  %5 = insertvalue { i16, ptr } %4, ptr %3, 1
  %6 = tail call ptr @swift_retain(ptr returned %3) #20
  ret { i16, ptr } %5
}

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.start.p0(i64 immarg, ptr captures(none)) #6

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.end.p0(i64 immarg, ptr captures(none)) #6

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i1 @"$s14OwnedTemplates4RootV5threeAA5ThreeVySbSuAA6ClientVGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(49) %0) #7 {
entry:
  %.three = getelementptr inbounds nuw i8, ptr %0, i64 48
  %1 = load i1, ptr %.three, align 8
  ret i1 %1
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy1_1(ptr %0, ptr %1, ptr %2) #8 {
entry:
  %3 = load i8, ptr %1, align 1
  store i8 %3, ptr %0, align 1
  ret ptr %0
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias writeonly captures(none), ptr noalias readonly captures(none), i64, i1 immarg) #9

; Function Attrs: nounwind
define linkonce_odr hidden void @__swift_noop_void_return(ptr %0, ptr %1) #8 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates6ValuesVMa"(i64 %0) #10 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates6ValuesVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s14OwnedTemplates6ClientVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Client) #7 {
  %1 = tail call i32 @"$s14OwnedTemplates6ValuesVwetTm"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Client) #7
  ret i32 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s14OwnedTemplates6ValuesVwetTm"(ptr noalias readonly captures(none) %0, i32 %1, ptr readnone captures(none) %2) #7 {
entry:
  %3 = icmp eq i32 %1, 0
  br i1 %3, label %41, label %4

4:                                                ; preds = %entry
  %5 = icmp ugt i32 %1, 254
  br i1 %5, label %6, label %31

6:                                                ; preds = %4
  %7 = add i32 %1, 1
  %8 = icmp ult i32 %7, 65280
  %9 = icmp ult i32 %7, 16776960
  %10 = select i1 %9, i32 2, i32 4
  %11 = select i1 %8, i32 1, i32 %10
  %12 = getelementptr inbounds nuw i8, ptr %0, i64 1
  switch i32 %11, label %21 [
    i32 4, label %19
    i32 1, label %13
    i32 2, label %16
  ]

13:                                               ; preds = %6
  %14 = load i8, ptr %12, align 1
  %15 = zext i8 %14 to i32
  br label %22

16:                                               ; preds = %6
  %17 = load i16, ptr %12, align 1
  %18 = zext i16 %17 to i32
  br label %22

19:                                               ; preds = %6
  %20 = load i32, ptr %12, align 1
  br label %22

21:                                               ; preds = %6
  unreachable

22:                                               ; preds = %19, %16, %13
  %23 = phi i32 [ %15, %13 ], [ %18, %16 ], [ %20, %19 ]
  %24 = icmp eq i32 %23, 0
  br i1 %24, label %31, label %25

25:                                               ; preds = %22
  %26 = shl i32 %23, 8
  %27 = load i8, ptr %0, align 1
  %28 = zext i8 %27 to i32
  %29 = add i32 %26, -2
  %30 = add i32 %29, %28
  br label %41

31:                                               ; preds = %22, %4
  %32 = load i8, ptr %0, align 1
  %33 = icmp ult i8 %32, 2
  br i1 %33, label %41, label %34

34:                                               ; preds = %31
  %35 = zext i8 %32 to i31
  %36 = and i31 %35, 1
  %37 = and i31 %35, 254
  %38 = add nsw i31 %37, -2
  %39 = or disjoint i31 %38, %36
  %40 = zext nneg i31 %39 to i32
  br label %41

41:                                               ; preds = %entry, %31, %34, %25
  %42 = phi i32 [ %30, %25 ], [ -1, %31 ], [ %40, %34 ], [ -1, %entry ]
  %43 = add i32 %42, 1
  ret i32 %43
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s14OwnedTemplates6ClientVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Client) #2 {
  tail call void @"$s14OwnedTemplates6ValuesVwstTm"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Client) #2
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s14OwnedTemplates6ValuesVwstTm"(ptr noalias writeonly captures(none) %0, i32 %1, i32 %2, ptr readnone captures(none) %3) #2 {
entry:
  %4 = getelementptr inbounds nuw i8, ptr %0, i64 1
  %5 = icmp ugt i32 %2, 254
  br i1 %5, label %6, label %12

6:                                                ; preds = %entry
  %7 = add i32 %2, 1
  %8 = icmp ult i32 %7, 65280
  %9 = icmp ult i32 %7, 16776960
  %10 = select i1 %9, i32 2, i32 4
  %11 = select i1 %8, i32 1, i32 %10
  br label %12

12:                                               ; preds = %6, %entry
  %13 = phi i32 [ 0, %entry ], [ %11, %6 ]
  %14 = icmp ult i32 %1, 255
  br i1 %14, label %15, label %29

15:                                               ; preds = %12
  switch i32 %13, label %19 [
    i32 0, label %20
    i32 1, label %16
    i32 2, label %17
    i32 4, label %18
  ]

16:                                               ; preds = %15
  store i8 0, ptr %4, align 1
  br label %20

17:                                               ; preds = %15
  store i16 0, ptr %4, align 1
  br label %20

18:                                               ; preds = %15
  store i32 0, ptr %4, align 1
  br label %20

19:                                               ; preds = %15
  unreachable

20:                                               ; preds = %15, %18, %17, %16
  %21 = icmp eq i32 %1, 0
  br i1 %21, label %40, label %22

22:                                               ; preds = %20
  %23 = trunc nuw i32 %1 to i8
  %24 = add i8 %23, -1
  %25 = and i8 %24, 1
  %26 = and i8 %24, -2
  %27 = add nuw i8 %26, 2
  %28 = or disjoint i8 %27, %25
  store i8 %28, ptr %0, align 1
  br label %40

29:                                               ; preds = %12
  %30 = add i32 %1, -255
  %31 = lshr i32 %30, 8
  %32 = add nuw nsw i32 %31, 1
  %33 = trunc i32 %30 to i8
  store i8 %33, ptr %0, align 1
  switch i32 %13, label %39 [
    i32 0, label %40
    i32 1, label %34
    i32 2, label %36
    i32 4, label %38
  ]

34:                                               ; preds = %29
  %35 = trunc i32 %32 to i8
  store i8 %35, ptr %4, align 1
  br label %40

36:                                               ; preds = %29
  %37 = trunc i32 %32 to i16
  store i16 %37, ptr %4, align 1
  br label %40

38:                                               ; preds = %29
  store i32 %32, ptr %4, align 1
  br label %40

39:                                               ; preds = %29
  unreachable

40:                                               ; preds = %34, %36, %38, %29, %22, %20
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates6ClientVMa"(i64 %0) #10 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates10DependencyVMi"(ptr %0, ptr %1, ptr %2) #8 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 16) #11
  ret ptr %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s14OwnedTemplates10DependencyVMr"(ptr %"Dependency<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #8 {
entry:
  %classFields = alloca [2 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 16, ptr nonnull %classFields)
  store ptr getelementptr inbounds nuw (i8, ptr @"$sBoWV", i64 64), ptr %classFields, align 8
  %2 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #21
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 24
  %8 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  %10 = getelementptr inbounds nuw i8, ptr %classFields, i64 8
  store ptr %9, ptr %10, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Dependency<Value>", i64 0, i64 2, ptr nonnull %classFields, ptr nonnull %7) #11
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
define internal ptr @"$s14OwnedTemplates10DependencyVwCP"(ptr noalias initializes((0, 8)) %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %2, align 8, !invariant.load !17
  %3 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %3 to i64
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = and i32 %flags, 1048576
  %flags.isBitwiseTakable = icmp eq i32 %5, 0
  %6 = icmp samesign ult i32 %3, 8
  %7 = sub nuw nsw i64 -9, %flags.alignmentMask
  %8 = or i64 %7, %flags.alignmentMask
  %9 = sub i64 %8, %size
  %10 = icmp ugt i64 %9, -26
  %11 = and i1 %flags.isBitwiseTakable, %10
  %12 = and i1 %6, %11
  br i1 %12, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = load ptr, ptr %src, align 8
  store ptr %14, ptr %dest, align 8
  %15 = ptrtoint ptr %dest to i64
  %16 = add i64 %15, 8
  %17 = ptrtoint ptr %src to i64
  %18 = add i64 %17, 8
  %19 = add i64 %16, %flags.alignmentMask
  %20 = and i64 %19, %13
  %21 = inttoptr i64 %20 to ptr
  %22 = add i64 %18, %flags.alignmentMask
  %23 = and i64 %22, %13
  %24 = inttoptr i64 %23 to ptr
  %25 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %25, align 8, !invariant.load !17
  %26 = tail call ptr @swift_retain(ptr returned %14) #20
  %27 = tail call ptr %InitializeWithCopy(ptr noalias %21, ptr noalias %24, ptr nonnull %Value) #11
  br label %35

allocateBB:                                       ; preds = %entry
  %28 = load ptr, ptr %src, align 8
  store ptr %28, ptr %dest, align 8
  %29 = add nuw nsw i64 %flags.alignmentMask, 16
  %30 = and i64 %flags.alignmentMask, 248
  %31 = xor i64 %30, 504
  %32 = and i64 %31, %29
  %33 = getelementptr inbounds nuw i8, ptr %28, i64 %32
  %34 = tail call ptr @swift_retain(ptr returned %28) #20
  br label %35

35:                                               ; preds = %allocateBB, %inlineBB
  %36 = phi ptr [ %dest, %inlineBB ], [ %33, %allocateBB ]
  ret ptr %36
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates10DependencyVwxx"(ptr noalias %object, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %toDestroy = load ptr, ptr %object, align 8
  tail call void @swift_release(ptr %toDestroy) #11
  %0 = ptrtoint ptr %object to i64
  %1 = add i64 %0, 8
  %2 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %4, align 8, !invariant.load !17
  %5 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %5 to i64
  %6 = add i64 %1, %flags.alignmentMask
  %7 = xor i64 %flags.alignmentMask, -1
  %8 = and i64 %6, %7
  %9 = inttoptr i64 %8 to ptr
  %10 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %10, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %9, ptr %Value) #11
  ret void
}

; Function Attrs: nounwind
declare void @swift_release(ptr) local_unnamed_addr #11

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates10DependencyVwcp"(ptr noalias returned initializes((0, 8)) %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = ptrtoint ptr %dest to i64
  %2 = ptrtoint ptr %src to i64
  %3 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %7 = add nuw nsw i64 %flags.alignmentMask, 8
  %8 = add i64 %7, %1
  %9 = xor i64 %flags.alignmentMask, -1
  %10 = and i64 %8, %9
  %11 = inttoptr i64 %10 to ptr
  %12 = add i64 %7, %2
  %13 = and i64 %12, %9
  %14 = inttoptr i64 %13 to ptr
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %15, align 8, !invariant.load !17
  %16 = tail call ptr @swift_retain(ptr returned %0) #20
  %17 = tail call ptr %InitializeWithCopy(ptr noalias %11, ptr noalias %14, ptr %Value) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates10DependencyVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  %oldValue = load ptr, ptr %dest, align 8
  store ptr %0, ptr %dest, align 8
  %1 = tail call ptr @swift_retain(ptr returned %0) #20
  tail call void @swift_release(ptr %oldValue) #11
  %2 = ptrtoint ptr %dest to i64
  %3 = ptrtoint ptr %src to i64
  %4 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %5, align 8, !invariant.load !17, !dereferenceable !18
  %6 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %6, align 8, !invariant.load !17
  %7 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %7 to i64
  %8 = add nuw nsw i64 %flags.alignmentMask, 8
  %9 = add i64 %8, %2
  %10 = xor i64 %flags.alignmentMask, -1
  %11 = and i64 %9, %10
  %12 = inttoptr i64 %11 to ptr
  %13 = add i64 %8, %3
  %14 = and i64 %13, %10
  %15 = inttoptr i64 %14 to ptr
  %16 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %16, align 8, !invariant.load !17
  %17 = tail call ptr %AssignWithCopy(ptr %12, ptr %15, ptr %Value) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates10DependencyVwtk"(ptr noalias returned initializes((0, 8)) %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = ptrtoint ptr %dest to i64
  %2 = ptrtoint ptr %src to i64
  %3 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %7 = add nuw nsw i64 %flags.alignmentMask, 8
  %8 = add i64 %7, %1
  %9 = xor i64 %flags.alignmentMask, -1
  %10 = and i64 %8, %9
  %11 = inttoptr i64 %10 to ptr
  %12 = add i64 %7, %2
  %13 = and i64 %12, %9
  %14 = inttoptr i64 %13 to ptr
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %15, align 8, !invariant.load !17
  %16 = tail call ptr %InitializeWithTake(ptr noalias %11, ptr noalias %14, ptr %Value) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates10DependencyVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  %oldValue = load ptr, ptr %dest, align 8
  store ptr %0, ptr %dest, align 8
  tail call void @swift_release(ptr %oldValue) #11
  %1 = ptrtoint ptr %dest to i64
  %2 = ptrtoint ptr %src to i64
  %3 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %7 = add nuw nsw i64 %flags.alignmentMask, 8
  %8 = add i64 %7, %1
  %9 = xor i64 %flags.alignmentMask, -1
  %10 = and i64 %8, %9
  %11 = inttoptr i64 %10 to ptr
  %12 = add i64 %7, %2
  %13 = and i64 %12, %9
  %14 = inttoptr i64 %13 to ptr
  %15 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %15, align 8, !invariant.load !17
  %16 = tail call ptr %AssignWithTake(ptr noalias %11, ptr noalias %14, ptr %Value) #11
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s14OwnedTemplates10DependencyVwet"(ptr noalias %value, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #12 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount, i32 2147483647)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %3, align 8, !invariant.load !17
  %4 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %4 to i64
  %5 = xor i64 %flags.alignmentMask, -1
  %6 = add nuw nsw i64 %flags.alignmentMask, 8
  %7 = and i64 %6, %5
  %8 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %8, align 8, !invariant.load !17
  %size1 = add i64 %7, %size
  %9 = trunc i64 %size1 to i32
  %10 = icmp eq i32 %numEmptyCases, 0
  br i1 %10, label %found_max_xi, label %11

11:                                               ; preds = %entry
  %12 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %12, label %13, label %.thread17

13:                                               ; preds = %11
  %14 = icmp ugt i32 %9, 3
  br i1 %14, label %.thread16, label %15

15:                                               ; preds = %13
  %16 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %17 = shl nuw nsw i32 %9, 3
  %notmask = shl nsw i32 -1, %17
  %18 = xor i32 %notmask, -1
  %19 = add nuw i32 %16, %18
  %20 = lshr i32 %19, %17
  %.fr = freeze i32 %20
  %21 = icmp ult i32 %.fr, 255
  br i1 %21, label %.thread11, label %26

.thread11:                                        ; preds = %15
  %22 = icmp eq i32 %.fr, 0
  br i1 %22, label %.thread17, label %.thread16

.thread16:                                        ; preds = %13, %.thread11
  %23 = getelementptr inbounds i8, ptr %value, i64 %size1
  %24 = load i8, ptr %23, align 1
  %25 = zext i8 %24 to i32
  br label %34

26:                                               ; preds = %15
  %27 = icmp ugt i32 %.fr, 65534
  %28 = getelementptr inbounds i8, ptr %value, i64 %size1
  br i1 %27, label %32, label %29

29:                                               ; preds = %26
  %30 = load i16, ptr %28, align 1
  %31 = zext i16 %30 to i32
  br label %34

32:                                               ; preds = %26
  %33 = load i32, ptr %28, align 1
  br label %34

34:                                               ; preds = %32, %29, %.thread16
  %35 = phi i32 [ %25, %.thread16 ], [ %31, %29 ], [ %33, %32 ]
  %36 = icmp eq i32 %35, 0
  br i1 %36, label %.thread17, label %37

37:                                               ; preds = %34
  %38 = add i32 %35, -1
  %39 = shl nuw nsw i32 %9, 3
  %40 = shl i32 %38, %39
  %41 = select i1 %14, i32 0, i32 %40
  %.not = icmp eq i32 %9, 0
  br i1 %.not, label %56, label %42

42:                                               ; preds = %37
  %43 = select i1 %14, i32 4, i32 %9
  switch i32 %43, label %55 [
    i32 1, label %44
    i32 2, label %47
    i32 3, label %50
    i32 4, label %53
  ]

44:                                               ; preds = %42
  %45 = load i8, ptr %value, align 8
  %46 = zext i8 %45 to i32
  br label %56

47:                                               ; preds = %42
  %48 = load i16, ptr %value, align 8
  %49 = zext i16 %48 to i32
  br label %56

50:                                               ; preds = %42
  %51 = load i24, ptr %value, align 8
  %52 = zext i24 %51 to i32
  br label %56

53:                                               ; preds = %42
  %54 = load i32, ptr %value, align 8
  br label %56

55:                                               ; preds = %42
  unreachable

56:                                               ; preds = %44, %47, %50, %53, %37
  %57 = phi i32 [ 0, %37 ], [ %46, %44 ], [ %49, %47 ], [ %52, %50 ], [ %54, %53 ]
  %58 = or i32 %57, %41
  %59 = add nuw i32 %num-extra-inhabitants, 1
  %60 = add i32 %59, %58
  br label %found_max_xi

.thread17:                                        ; preds = %.thread11, %11, %34
  %61 = icmp sgt i32 %extraInhabitantCount, -1
  br i1 %61, label %is-valid-pointer, label %64

is-valid-pointer:                                 ; preds = %.thread17
  %62 = load i64, ptr %value, align 8
  %spec.select6 = tail call i64 @llvm.umin.i64(i64 %62, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select6 to i32
  %63 = add i32 %spec.select, 1
  br label %found_max_xi

64:                                               ; preds = %.thread17
  %65 = ptrtoint ptr %value to i64
  %66 = add i64 %65, 8
  %67 = add i64 %66, %flags.alignmentMask
  %68 = and i64 %67, %5
  %69 = inttoptr i64 %68 to ptr
  %70 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %70, align 8, !invariant.load !17
  %71 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %69, i32 %extraInhabitantCount, ptr nonnull %Value) #22
  br label %found_max_xi

found_max_xi:                                     ; preds = %entry, %64, %is-valid-pointer, %56
  %72 = phi i32 [ %60, %56 ], [ %63, %is-valid-pointer ], [ %71, %64 ], [ 0, %entry ]
  ret i32 %72
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates10DependencyVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount, i32 2147483647)
  %3 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %3, align 8, !invariant.load !17
  %4 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %4 to i64
  %5 = xor i64 %flags.alignmentMask, -1
  %6 = add nuw nsw i64 %flags.alignmentMask, 8
  %7 = and i64 %6, %5
  %8 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %8, align 8, !invariant.load !17
  %size1 = add i64 %7, %size
  %9 = trunc i64 %size1 to i32
  %10 = getelementptr inbounds i8, ptr %value, i64 %size1
  %11 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %11, label %12, label %.thread12.thread

12:                                               ; preds = %entry
  %13 = icmp ugt i32 %9, 3
  br i1 %13, label %.thread12.thread, label %14

14:                                               ; preds = %12
  %15 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %16 = shl nuw nsw i32 %9, 3
  %notmask = shl nsw i32 -1, %16
  %17 = xor i32 %notmask, -1
  %18 = add nuw i32 %15, %17
  %19 = lshr i32 %18, %16
  %.fr = freeze i32 %19
  %20 = icmp ult i32 %.fr, 255
  %21 = icmp ult i32 %.fr, 65535
  %. = select i1 %21, i32 2, i32 4
  br i1 %20, label %.thread12, label %.thread12.thread

.thread12:                                        ; preds = %14
  %22 = icmp ne i32 %.fr, 0
  %spec.select = zext i1 %22 to i32
  br label %.thread12.thread

.thread12.thread:                                 ; preds = %.thread12, %14, %12, %entry
  %23 = phi i32 [ 0, %entry ], [ 1, %12 ], [ %., %14 ], [ %spec.select, %.thread12 ]
  %.not = icmp ugt i32 %whichCase, %num-extra-inhabitants
  br i1 %.not, label %47, label %24

24:                                               ; preds = %.thread12.thread
  switch i32 %23, label %28 [
    i32 0, label %29
    i32 1, label %25
    i32 2, label %26
    i32 4, label %27
  ]

25:                                               ; preds = %24
  store i8 0, ptr %10, align 1
  br label %29

26:                                               ; preds = %24
  store i16 0, ptr %10, align 1
  br label %29

27:                                               ; preds = %24
  store i32 0, ptr %10, align 1
  br label %29

28:                                               ; preds = %24
  unreachable

29:                                               ; preds = %24, %27, %26, %25
  %.not7 = icmp eq i32 %whichCase, 0
  br i1 %.not7, label %found_max_xi, label %30

30:                                               ; preds = %29
  %31 = icmp sgt i32 %extraInhabitantCount, -1
  br i1 %31, label %32, label %40

32:                                               ; preds = %30
  %33 = icmp sgt i32 %whichCase, -1
  br i1 %33, label %34, label %37

34:                                               ; preds = %32
  %35 = add nsw i32 %whichCase, -1
  %36 = zext nneg i32 %35 to i64
  store i64 %36, ptr %value, align 8
  br label %found_max_xi

37:                                               ; preds = %32
  %38 = and i32 %whichCase, 2147483647
  %39 = zext nneg i32 %38 to i64
  store i64 %39, ptr %value, align 8
  br label %found_max_xi

40:                                               ; preds = %30
  %41 = ptrtoint ptr %value to i64
  %42 = add i64 %41, 8
  %43 = add i64 %42, %flags.alignmentMask
  %44 = and i64 %43, %5
  %45 = inttoptr i64 %44 to ptr
  %46 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %46, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %45, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %Value) #11
  br label %found_max_xi

47:                                               ; preds = %.thread12.thread
  %48 = xor i32 %num-extra-inhabitants, -1
  %49 = add i32 %whichCase, %48
  %50 = icmp ugt i32 %9, 3
  br i1 %50, label %.thread18, label %51

.thread18:                                        ; preds = %47
  tail call void @llvm.memset.p0.i32(ptr align 8 %value, i8 0, i32 %9, i1 false)
  store i32 %49, ptr %value, align 8
  br label %65

51:                                               ; preds = %47
  %52 = shl nuw nsw i32 %9, 3
  %53 = lshr i32 %49, %52
  %54 = add i32 %53, 1
  %notmask5 = shl nsw i32 -1, %52
  %55 = xor i32 %notmask5, -1
  %56 = and i32 %49, %55
  %.not6 = icmp eq i32 %9, 0
  br i1 %.not6, label %65, label %57

57:                                               ; preds = %51
  tail call void @llvm.memset.p0.i32(ptr align 8 %value, i8 0, i32 %9, i1 false)
  switch i32 %9, label %64 [
    i32 1, label %58
    i32 2, label %60
    i32 3, label %62
  ]

58:                                               ; preds = %57
  %59 = trunc i32 %49 to i8
  store i8 %59, ptr %value, align 8
  br label %65

60:                                               ; preds = %57
  %61 = trunc i32 %56 to i16
  store i16 %61, ptr %value, align 8
  br label %65

62:                                               ; preds = %57
  %63 = trunc nuw i32 %56 to i24
  store i24 %63, ptr %value, align 8
  br label %65

64:                                               ; preds = %57
  unreachable

65:                                               ; preds = %58, %60, %62, %.thread18, %51
  %66 = phi i32 [ %54, %58 ], [ %54, %60 ], [ %54, %62 ], [ 1, %.thread18 ], [ %54, %51 ]
  switch i32 %23, label %72 [
    i32 0, label %found_max_xi
    i32 1, label %67
    i32 2, label %69
    i32 4, label %71
  ]

67:                                               ; preds = %65
  %68 = trunc i32 %66 to i8
  store i8 %68, ptr %10, align 1
  br label %found_max_xi

69:                                               ; preds = %65
  %70 = trunc i32 %66 to i16
  store i16 %70, ptr %10, align 1
  br label %found_max_xi

71:                                               ; preds = %65
  store i32 %66, ptr %10, align 1
  br label %found_max_xi

72:                                               ; preds = %65
  unreachable

found_max_xi:                                     ; preds = %37, %67, %69, %71, %65, %34, %40, %29
  ret void
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: write)
declare void @llvm.memset.p0.i32(ptr writeonly captures(none), i8, i32, i1 immarg) #13

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates10DependencyVMa"(i64 %0, ptr readnone %1) #14 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s14OwnedTemplates10DependencyVMn") #23
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
declare ptr @swift_allocateGenericValueMetadata(ptr, ptr, ptr, i64) local_unnamed_addr #11

; Function Attrs: mustprogress nofree nounwind willreturn memory(read)
declare swiftcc %swift.metadata_response @swift_checkMetadataState(i64, ptr) local_unnamed_addr #15

; Function Attrs: nounwind
declare void @swift_initStructMetadata(ptr, i64, i64, ptr, ptr) local_unnamed_addr #11

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVMi"(ptr %0, ptr %1, ptr %2) #8 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 32) #11
  ret ptr %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s14OwnedTemplates3TwoVMr"(ptr %"Two<First, Second>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #8 {
entry:
  %classFields = alloca [3 x ptr], align 8
  %2 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 32
  call void @llvm.lifetime.start.p0(i64 24, ptr nonnull %classFields)
  %3 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %First) #21
  %5 = extractvalue %swift.metadata_response %4, 0
  %6 = extractvalue %swift.metadata_response %4, 1
  %7 = icmp ult i64 %6, 64
  br i1 %7, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %8 = getelementptr inbounds i8, ptr %5, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  %10 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %10, align 8, !invariant.load !17
  %11 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Second) #21
  %12 = extractvalue %swift.metadata_response %11, 0
  %13 = extractvalue %swift.metadata_response %11, 1
  %14 = icmp ult i64 %13, 64
  br i1 %14, label %dependency-satisfied1, label %metadata-dependencies.cont

dependency-satisfied1:                            ; preds = %dependency-satisfied
  %15 = getelementptr inbounds i8, ptr %12, i64 -8
  %.valueWitnesses2 = load ptr, ptr %15, align 8, !invariant.load !17, !dereferenceable !18
  %16 = getelementptr inbounds nuw i8, ptr %.valueWitnesses2, i64 64
  %17 = getelementptr inbounds nuw i8, ptr %classFields, i64 8
  store ptr %16, ptr %17, align 8
  %18 = getelementptr inbounds nuw i8, ptr %classFields, i64 16
  store ptr getelementptr inbounds nuw (i8, ptr @"$sBoWV", i64 64), ptr %18, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Two<First, Second>", i64 0, i64 3, ptr nonnull %classFields, ptr nonnull %2) #11
  call void @llvm.lifetime.end.p0(i64 24, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied1, %dependency-satisfied, %entry
  %19 = phi ptr [ %5, %entry ], [ %12, %dependency-satisfied ], [ null, %dependency-satisfied1 ]
  %20 = phi i64 [ 63, %entry ], [ 63, %dependency-satisfied ], [ 0, %dependency-satisfied1 ]
  %21 = insertvalue %swift.metadata_response undef, ptr %19, 0
  %22 = insertvalue %swift.metadata_response %21, i64 %20, 1
  ret %swift.metadata_response %22
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %7 = xor i64 %flags.alignmentMask, -1
  %8 = add i64 %size, %flags.alignmentMask
  %9 = and i64 %8, %7
  %10 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size1 = load i64, ptr %10, align 8, !invariant.load !17
  %11 = add i64 %size1, 7
  %12 = add i64 %11, %9
  %13 = and i64 %12, -8
  %size2 = add i64 %13, 8
  %14 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 80
  %flags3 = load i32, ptr %14, align 8, !invariant.load !17
  %15 = and i32 %flags3, 248
  %16 = or i32 %6, %15
  %17 = or i32 %flags3, %flags
  %18 = and i32 %17, 1048576
  %19 = icmp eq i32 %18, 0
  %20 = icmp samesign ult i32 %16, 8
  %21 = icmp ult i64 %size2, 25
  %22 = and i1 %19, %21
  %23 = and i1 %20, %22
  br i1 %23, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %24 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %24, align 8, !invariant.load !17
  %25 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %First) #11
  %26 = ptrtoint ptr %dest to i64
  %27 = ptrtoint ptr %src to i64
  %28 = add i64 %8, %26
  %29 = and i64 %28, %7
  %30 = inttoptr i64 %29 to ptr
  %31 = add i64 %8, %27
  %32 = and i64 %31, %7
  %33 = inttoptr i64 %32 to ptr
  %34 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy6 = load ptr, ptr %34, align 8, !invariant.load !17
  %35 = tail call ptr %InitializeWithCopy6(ptr noalias %30, ptr noalias %33, ptr nonnull %Second) #11
  %36 = add i64 %11, %29
  %37 = and i64 %36, -8
  %38 = inttoptr i64 %37 to ptr
  %39 = add i64 %11, %32
  %40 = and i64 %39, -8
  %41 = inttoptr i64 %40 to ptr
  %42 = load ptr, ptr %41, align 8
  store ptr %42, ptr %38, align 8
  br label %50

allocateBB:                                       ; preds = %entry
  %43 = or i32 %16, 7
  %44 = zext nneg i32 %43 to i64
  %45 = load ptr, ptr %src, align 8
  store ptr %45, ptr %dest, align 8
  %46 = add nuw nsw i64 %44, 16
  %47 = xor i64 %44, -1
  %48 = and i64 %46, %47
  %49 = getelementptr inbounds nuw i8, ptr %45, i64 %48
  br label %50

50:                                               ; preds = %allocateBB, %inlineBB
  %.sink = phi ptr [ %45, %allocateBB ], [ %42, %inlineBB ]
  %51 = phi ptr [ %49, %allocateBB ], [ %dest, %inlineBB ]
  %52 = tail call ptr @swift_retain(ptr returned %.sink) #20
  ret ptr %51
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates3TwoVwxx"(ptr noalias %object, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %First) #11
  %3 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = ptrtoint ptr %object to i64
  %5 = add i64 %size, %4
  %6 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %8, align 8, !invariant.load !17
  %9 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %9 to i64
  %10 = add i64 %5, %flags.alignmentMask
  %11 = xor i64 %flags.alignmentMask, -1
  %12 = and i64 %10, %11
  %13 = inttoptr i64 %12 to ptr
  %14 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 8
  %Destroy1 = load ptr, ptr %14, align 8, !invariant.load !17
  tail call void %Destroy1(ptr noalias %13, ptr %Second) #11
  %15 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %15, align 8, !invariant.load !17
  %16 = add i64 %size2, 7
  %17 = add i64 %16, %12
  %18 = and i64 %17, -8
  %19 = inttoptr i64 %18 to ptr
  %toDestroy = load ptr, ptr %19, align 8
  tail call void @swift_release(ptr %toDestroy) #11
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %First) #11
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %InitializeWithCopy1(ptr noalias %15, ptr noalias %18, ptr %Second) #11
  %21 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %21, align 8, !invariant.load !17
  %22 = add i64 %size2, 7
  %23 = add i64 %22, %14
  %24 = and i64 %23, -8
  %25 = inttoptr i64 %24 to ptr
  %26 = add i64 %22, %17
  %27 = and i64 %26, -8
  %28 = inttoptr i64 %27 to ptr
  %29 = load ptr, ptr %28, align 8
  store ptr %29, ptr %25, align 8
  %30 = tail call ptr @swift_retain(ptr returned %29) #20
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %First) #11
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 24
  %AssignWithCopy1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %AssignWithCopy1(ptr %15, ptr %18, ptr %Second) #11
  %21 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %21, align 8, !invariant.load !17
  %22 = add i64 %size2, 7
  %23 = add i64 %22, %14
  %24 = and i64 %23, -8
  %25 = inttoptr i64 %24 to ptr
  %26 = add i64 %22, %17
  %27 = and i64 %26, -8
  %28 = inttoptr i64 %27 to ptr
  %29 = load ptr, ptr %28, align 8
  %oldValue = load ptr, ptr %25, align 8
  store ptr %29, ptr %25, align 8
  %30 = tail call ptr @swift_retain(ptr returned %29) #20
  tail call void @swift_release(ptr %oldValue) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %First) #11
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 32
  %InitializeWithTake1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %InitializeWithTake1(ptr noalias %15, ptr noalias %18, ptr %Second) #11
  %21 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %21, align 8, !invariant.load !17
  %22 = add i64 %size2, 7
  %23 = add i64 %22, %14
  %24 = and i64 %23, -8
  %25 = inttoptr i64 %24 to ptr
  %26 = add i64 %22, %17
  %27 = and i64 %26, -8
  %28 = inttoptr i64 %27 to ptr
  %29 = load ptr, ptr %28, align 8
  store ptr %29, ptr %25, align 8
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates3TwoVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %First) #11
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 40
  %AssignWithTake1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %AssignWithTake1(ptr noalias %15, ptr noalias %18, ptr %Second) #11
  %21 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %21, align 8, !invariant.load !17
  %22 = add i64 %size2, 7
  %23 = add i64 %22, %14
  %24 = and i64 %23, -8
  %25 = inttoptr i64 %24 to ptr
  %26 = add i64 %22, %17
  %27 = and i64 %26, -8
  %28 = inttoptr i64 %27 to ptr
  %29 = load ptr, ptr %28, align 8
  %oldValue = load ptr, ptr %25, align 8
  store ptr %29, ptr %25, align 8
  tail call void @swift_release(ptr %oldValue) #11
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s14OwnedTemplates3TwoVwet"(ptr noalias %value, i32 %numEmptyCases, ptr readonly captures(none) %"Two<First, Second>") #12 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 84
  %extraInhabitantCount1 = load i32, ptr %5, align 4, !invariant.load !17
  %6 = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount1, i32 %extraInhabitantCount)
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %6, i32 2147483647)
  %7 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %8, align 8, !invariant.load !17
  %9 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %9 to i64
  %10 = xor i64 %flags.alignmentMask, -1
  %11 = add i64 %size, %flags.alignmentMask
  %12 = and i64 %11, %10
  %13 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %13, align 8, !invariant.load !17
  %14 = add i64 %size2, 7
  %15 = add i64 %14, %12
  %16 = and i64 %15, -8
  %size3 = add i64 %16, 8
  %17 = icmp eq i32 %numEmptyCases, 0
  br i1 %17, label %found_max_xi, label %18

18:                                               ; preds = %entry
  %19 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %19, label %20, label %.thread

20:                                               ; preds = %18
  %21 = and i64 %size3, 4294967288
  %.not = icmp eq i64 %21, 0
  %22 = add nsw i32 %numEmptyCases, 1
  %23 = sub i32 %22, %num-extra-inhabitants
  %num-tags-phi = select i1 %.not, i32 %23, i32 2
  %24 = icmp ult i32 %num-tags-phi, 2
  %25 = icmp ult i32 %num-tags-phi, 256
  %26 = icmp ult i32 %num-tags-phi, 65536
  %27 = select i1 %26, i32 2, i32 4
  %28 = select i1 %25, i32 1, i32 %27
  %num-tag-bytes = select i1 %24, i32 0, i32 %28
  %29 = getelementptr inbounds i8, ptr %value, i64 %size3
  switch i32 %num-tag-bytes, label %38 [
    i32 0, label %.thread
    i32 1, label %30
    i32 2, label %33
    i32 4, label %36
  ]

30:                                               ; preds = %20
  %31 = load i8, ptr %29, align 1
  %32 = zext i8 %31 to i32
  br label %39

33:                                               ; preds = %20
  %34 = load i16, ptr %29, align 1
  %35 = zext i16 %34 to i32
  br label %39

36:                                               ; preds = %20
  %37 = load i32, ptr %29, align 1
  br label %39

38:                                               ; preds = %20
  unreachable

39:                                               ; preds = %36, %33, %30
  %40 = phi i32 [ %32, %30 ], [ %35, %33 ], [ %37, %36 ]
  %41 = icmp eq i32 %40, 0
  br i1 %41, label %.thread, label %42

42:                                               ; preds = %39
  %43 = add i32 %40, -1
  %44 = select i1 %.not, i32 %43, i32 0
  br i1 %.not, label %47, label %45

45:                                               ; preds = %42
  %46 = load i32, ptr %value, align 8
  br label %47

47:                                               ; preds = %45, %42
  %48 = phi i32 [ 0, %42 ], [ %46, %45 ]
  %49 = or i32 %48, %44
  %50 = add nuw i32 %num-extra-inhabitants, 1
  %51 = add i32 %50, %49
  br label %found_max_xi

.thread:                                          ; preds = %20, %18, %39
  %52 = icmp eq i32 %extraInhabitantCount, %num-extra-inhabitants
  br i1 %52, label %53, label %56

53:                                               ; preds = %.thread
  %54 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %54, align 8, !invariant.load !17
  %55 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %First) #22
  br label %found_max_xi

56:                                               ; preds = %.thread
  %57 = ptrtoint ptr %value to i64
  %58 = add i64 %11, %57
  %59 = and i64 %58, %10
  %60 = icmp eq i32 %extraInhabitantCount1, %num-extra-inhabitants
  br i1 %60, label %61, label %is-valid-pointer

61:                                               ; preds = %56
  %62 = inttoptr i64 %59 to ptr
  %63 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 48
  %GetEnumTagSinglePayload6 = load ptr, ptr %63, align 8, !invariant.load !17
  %64 = tail call i32 %GetEnumTagSinglePayload6(ptr noalias %62, i32 %extraInhabitantCount1, ptr nonnull %Second) #22
  br label %found_max_xi

is-valid-pointer:                                 ; preds = %56
  %65 = add i64 %14, %59
  %66 = and i64 %65, -8
  %67 = inttoptr i64 %66 to ptr
  %68 = icmp sgt i32 %6, -1
  tail call void @llvm.assume(i1 %68)
  %69 = load i64, ptr %67, align 8
  %spec.select11 = tail call i64 @llvm.umin.i64(i64 %69, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select11 to i32
  %70 = add i32 %spec.select, 1
  br label %found_max_xi

found_max_xi:                                     ; preds = %entry, %is-valid-pointer, %61, %53, %47
  %71 = phi i32 [ %51, %47 ], [ %55, %53 ], [ %64, %61 ], [ %70, %is-valid-pointer ], [ 0, %entry ]
  ret i32 %71
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates3TwoVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Two<First, Second>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Two<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 84
  %extraInhabitantCount1 = load i32, ptr %5, align 4, !invariant.load !17
  %6 = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount1, i32 %extraInhabitantCount)
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %6, i32 2147483647)
  %7 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %8, align 8, !invariant.load !17
  %9 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %9 to i64
  %10 = xor i64 %flags.alignmentMask, -1
  %11 = add i64 %size, %flags.alignmentMask
  %12 = and i64 %11, %10
  %13 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %13, align 8, !invariant.load !17
  %14 = add i64 %size2, 7
  %15 = add i64 %14, %12
  %16 = and i64 %15, -8
  %size3 = add i64 %16, 8
  %17 = trunc i64 %size3 to i32
  %18 = getelementptr inbounds i8, ptr %value, i64 %size3
  %19 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %19, label %20, label %28

20:                                               ; preds = %entry
  %.not = icmp eq i32 %17, 0
  %21 = add nsw i32 %numEmptyCases, 1
  %22 = sub i32 %21, %num-extra-inhabitants
  %num-tags-phi = select i1 %.not, i32 %22, i32 2
  %23 = icmp ult i32 %num-tags-phi, 2
  %24 = icmp ult i32 %num-tags-phi, 256
  %25 = icmp ult i32 %num-tags-phi, 65536
  %26 = select i1 %25, i32 2, i32 4
  %27 = select i1 %24, i32 1, i32 %26
  %num-tag-bytes = select i1 %23, i32 0, i32 %27
  br label %28

28:                                               ; preds = %20, %entry
  %29 = phi i32 [ 0, %entry ], [ %num-tag-bytes, %20 ]
  %.not8 = icmp ugt i32 %whichCase, %num-extra-inhabitants
  br i1 %.not8, label %60, label %30

30:                                               ; preds = %28
  switch i32 %29, label %34 [
    i32 0, label %35
    i32 1, label %31
    i32 2, label %32
    i32 4, label %33
  ]

31:                                               ; preds = %30
  store i8 0, ptr %18, align 1
  br label %35

32:                                               ; preds = %30
  store i16 0, ptr %18, align 1
  br label %35

33:                                               ; preds = %30
  store i32 0, ptr %18, align 1
  br label %35

34:                                               ; preds = %30
  unreachable

35:                                               ; preds = %30, %33, %32, %31
  %.not11 = icmp eq i32 %whichCase, 0
  br i1 %.not11, label %found_max_xi, label %36

36:                                               ; preds = %35
  %37 = icmp eq i32 %extraInhabitantCount, %num-extra-inhabitants
  br i1 %37, label %38, label %40

38:                                               ; preds = %36
  %39 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %39, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %First) #11
  br label %found_max_xi

40:                                               ; preds = %36
  %41 = ptrtoint ptr %value to i64
  %42 = add i64 %11, %41
  %43 = and i64 %42, %10
  %44 = icmp eq i32 %extraInhabitantCount1, %num-extra-inhabitants
  br i1 %44, label %45, label %48

45:                                               ; preds = %40
  %46 = inttoptr i64 %43 to ptr
  %47 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload6 = load ptr, ptr %47, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload6(ptr noalias %46, i32 %whichCase, i32 %extraInhabitantCount1, ptr nonnull %Second) #11
  br label %found_max_xi

48:                                               ; preds = %40
  %49 = add i64 %14, %43
  %50 = and i64 %49, -8
  %51 = inttoptr i64 %50 to ptr
  %52 = icmp sgt i32 %6, -1
  tail call void @llvm.assume(i1 %52)
  %53 = icmp sgt i32 %whichCase, -1
  br i1 %53, label %54, label %57

54:                                               ; preds = %48
  %55 = add nsw i32 %whichCase, -1
  %56 = zext nneg i32 %55 to i64
  store i64 %56, ptr %51, align 8
  br label %found_max_xi

57:                                               ; preds = %48
  %58 = and i32 %whichCase, 2147483647
  %59 = zext nneg i32 %58 to i64
  store i64 %59, ptr %51, align 8
  br label %found_max_xi

60:                                               ; preds = %28
  %.not9 = icmp eq i32 %17, 0
  %61 = sub nuw i32 %whichCase, %num-extra-inhabitants
  %spec.select = select i1 %.not9, i32 %61, i32 1
  br i1 %.not9, label %65, label %62

62:                                               ; preds = %60
  %63 = xor i32 %num-extra-inhabitants, -1
  %64 = add i32 %whichCase, %63
  tail call void @llvm.memset.p0.i32(ptr align 8 %value, i8 0, i32 %17, i1 false)
  store i32 %64, ptr %value, align 8
  br label %65

65:                                               ; preds = %62, %60
  switch i32 %29, label %71 [
    i32 0, label %found_max_xi
    i32 1, label %66
    i32 2, label %68
    i32 4, label %70
  ]

66:                                               ; preds = %65
  %67 = trunc i32 %spec.select to i8
  store i8 %67, ptr %18, align 1
  br label %found_max_xi

68:                                               ; preds = %65
  %69 = trunc i32 %spec.select to i16
  store i16 %69, ptr %18, align 1
  br label %found_max_xi

70:                                               ; preds = %65
  store i32 %spec.select, ptr %18, align 1
  br label %found_max_xi

71:                                               ; preds = %65
  unreachable

found_max_xi:                                     ; preds = %57, %66, %68, %70, %65, %54, %45, %38, %35
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates3TwoVMa"(i64 %0, ptr readnone %1, ptr readnone %2) #14 {
entry:
  %3 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr undef, ptr nonnull @"$s14OwnedTemplates3TwoVMn") #23
  ret %swift.metadata_response %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s14OwnedTemplates5ThreeVMr"(ptr %"Three<First, Second, Third>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #8 {
entry:
  %classFields = alloca [1 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 8, ptr nonnull %classFields)
  %2 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Third) #21
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 40
  %8 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Three<First, Second, Third>", i64 0, i64 1, ptr nonnull %classFields, ptr nonnull %7) #11
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
define internal ptr @"$s14OwnedTemplates5ThreeVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 64
  %size = load i64, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 80
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
  %10 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %10, align 8, !invariant.load !17
  %11 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %Third) #11
  br label %18

allocateBB:                                       ; preds = %entry
  %alignment-mask = zext nneg i32 %4 to i64
  %12 = load ptr, ptr %src, align 8
  store ptr %12, ptr %dest, align 8
  %13 = add nuw nsw i64 %alignment-mask, 16
  %14 = xor i64 %alignment-mask, -1
  %15 = and i64 %13, %14
  %16 = getelementptr inbounds nuw i8, ptr %12, i64 %15
  %17 = tail call ptr @swift_retain(ptr returned %12) #20
  br label %18

18:                                               ; preds = %allocateBB, %inlineBB
  %19 = phi ptr [ %dest, %inlineBB ], [ %16, %allocateBB ]
  ret ptr %19
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates5ThreeVwxx"(ptr noalias %object, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %Third) #11
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates5ThreeVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %Third) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates5ThreeVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %Third) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates5ThreeVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %Third) #11
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates5ThreeVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %Third) #11
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s14OwnedTemplates5ThreeVwet"(ptr noalias readonly %value, i32 %numEmptyCases, ptr readonly captures(none) %"Three<First, Second, Third>") #12 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 64
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
  %57 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %57, align 8, !invariant.load !17
  %58 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %Third) #22
  br label %59

59:                                               ; preds = %entry, %.thread15, %found_max_xi, %52
  %60 = phi i32 [ %56, %52 ], [ 0, %.thread15 ], [ %58, %found_max_xi ], [ 0, %entry ]
  ret i32 %60
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates5ThreeVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Three<First, Second, Third>") #8 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Three<First, Second, Third>", i64 32
  %Third = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Third, i64 -8
  %Third.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 64
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
  %26 = getelementptr inbounds nuw i8, ptr %Third.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %26, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %Third) #11
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
define swiftcc %swift.metadata_response @"$s14OwnedTemplates5ThreeVMa"(i64 %0, ptr readnone %1, ptr readnone %2, ptr readnone %3) #14 {
entry:
  %4 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr %3, ptr nonnull @"$s14OwnedTemplates5ThreeVMn") #23
  ret %swift.metadata_response %4
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates11ConstrainedVMi"(ptr %0, ptr %1, ptr %2) #8 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 24) #11
  ret ptr %3
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates11ConstrainedVMa"(i64 %0, ptr readnone %1, ptr readnone %2) #14 {
entry:
  %3 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr undef, ptr nonnull @"$s14OwnedTemplates11ConstrainedVMn") #23
  ret %swift.metadata_response %3
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates7ForeignOMa"(i64 %0) #10 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s14OwnedTemplates7ForeignOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates7ForeignO6ValuesVMa"(i64 %0) #10 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14OwnedTemplates7ForeignO6ValuesVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates7ForeignO10DependencyVMa"(i64 %0, ptr readnone %1) #14 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s14OwnedTemplates7ForeignO10DependencyVMn") #23
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates6NestedVMi"(ptr %0, ptr %1, ptr %2) #8 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 8) #11
  ret ptr %3
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates6NestedVMa"(i64 %0, ptr readnone %1) #14 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s14OwnedTemplates6NestedVMn") #23
  ret %swift.metadata_response %2
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates6NestedV5InnerVMa"(i64 %0, ptr readnone %1, ptr readnone %2) #14 {
entry:
  %3 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr undef, ptr nonnull @"$s14OwnedTemplates6NestedV5InnerVMn") #23
  ret %swift.metadata_response %3
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s14OwnedTemplates4RootVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Root) #3 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %2 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %1
}

; Function Attrs: nounwind
define internal void @"$s14OwnedTemplates4RootVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Root) #8 {
entry:
  %toDestroy = load ptr, ptr %object, align 8
  tail call void @swift_release(ptr %toDestroy) #11
  %object.other = getelementptr inbounds nuw i8, ptr %object, i64 16
  %toDestroy1 = load ptr, ptr %object.other, align 8
  tail call void @swift_release(ptr %toDestroy1) #11
  %object.two.keyPath = getelementptr inbounds nuw i8, ptr %object, i64 40
  %toDestroy2 = load ptr, ptr %object.two.keyPath, align 8
  tail call void @swift_release(ptr %toDestroy2) #11
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s14OwnedTemplates4RootVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 9), (16, 25), (32, 34), (40, 49)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Root) #3 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %dest.selected.value = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.selected.value = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load i8, ptr %src.selected.value, align 8
  store i8 %1, ptr %dest.selected.value, align 8
  %dest.other = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.other = getelementptr inbounds nuw i8, ptr %src, i64 16
  %2 = load ptr, ptr %src.other, align 8
  store ptr %2, ptr %dest.other, align 8
  %dest.other.value = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.other.value = getelementptr inbounds nuw i8, ptr %src, i64 24
  %3 = load i8, ptr %src.other.value, align 8
  store i8 %3, ptr %dest.other.value, align 8
  %dest.two = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.two = getelementptr inbounds nuw i8, ptr %src, i64 32
  %4 = load i8, ptr %src.two, align 8
  store i8 %4, ptr %dest.two, align 8
  %dest.two.second = getelementptr inbounds nuw i8, ptr %dest, i64 33
  %src.two.second = getelementptr inbounds nuw i8, ptr %src, i64 33
  %5 = load i8, ptr %src.two.second, align 1
  store i8 %5, ptr %dest.two.second, align 1
  %dest.two.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.two.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 40
  %6 = load ptr, ptr %src.two.keyPath, align 8
  store ptr %6, ptr %dest.two.keyPath, align 8
  %dest.three = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.three = getelementptr inbounds nuw i8, ptr %src, i64 48
  %7 = load i8, ptr %src.three, align 8
  store i8 %7, ptr %dest.three, align 8
  %8 = tail call ptr @swift_retain(ptr returned %0) #20
  %9 = tail call ptr @swift_retain(ptr returned %2) #20
  %10 = tail call ptr @swift_retain(ptr returned %6) #20
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates4RootVwca"(ptr returned captures(ret: address, provenance) initializes((8, 9), (24, 25), (32, 34), (48, 49)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Root) #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  %oldValue = load ptr, ptr %dest, align 8
  store ptr %0, ptr %dest, align 8
  %1 = tail call ptr @swift_retain(ptr returned %0) #20
  tail call void @swift_release(ptr %oldValue) #11
  %dest.selected.value = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.selected.value = getelementptr inbounds nuw i8, ptr %src, i64 8
  %2 = load i1, ptr %src.selected.value, align 8
  %3 = zext i1 %2 to i8
  store i8 %3, ptr %dest.selected.value, align 8
  %dest.other = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.other = getelementptr inbounds nuw i8, ptr %src, i64 16
  %4 = load ptr, ptr %src.other, align 8
  %oldValue1 = load ptr, ptr %dest.other, align 8
  store ptr %4, ptr %dest.other, align 8
  %5 = tail call ptr @swift_retain(ptr returned %4) #20
  tail call void @swift_release(ptr %oldValue1) #11
  %dest.other.value = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.other.value = getelementptr inbounds nuw i8, ptr %src, i64 24
  %6 = load i1, ptr %src.other.value, align 8
  %7 = zext i1 %6 to i8
  store i8 %7, ptr %dest.other.value, align 8
  %dest.two = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.two = getelementptr inbounds nuw i8, ptr %src, i64 32
  %8 = load i1, ptr %src.two, align 8
  %9 = zext i1 %8 to i8
  store i8 %9, ptr %dest.two, align 8
  %dest.two.second = getelementptr inbounds nuw i8, ptr %dest, i64 33
  %src.two.second = getelementptr inbounds nuw i8, ptr %src, i64 33
  %10 = load i1, ptr %src.two.second, align 1
  %11 = zext i1 %10 to i8
  store i8 %11, ptr %dest.two.second, align 1
  %dest.two.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.two.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 40
  %12 = load ptr, ptr %src.two.keyPath, align 8
  %oldValue2 = load ptr, ptr %dest.two.keyPath, align 8
  store ptr %12, ptr %dest.two.keyPath, align 8
  %13 = tail call ptr @swift_retain(ptr returned %12) #20
  tail call void @swift_release(ptr %oldValue2) #11
  %dest.three = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.three = getelementptr inbounds nuw i8, ptr %src, i64 48
  %14 = load i1, ptr %src.three, align 8
  %15 = zext i1 %14 to i8
  store i8 %15, ptr %dest.three, align 8
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy49_8(ptr %0, ptr %1, ptr %2) #8 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(49) %0, ptr noundef nonnull align 8 dereferenceable(49) %1, i64 49, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14OwnedTemplates4RootVwta"(ptr noalias returned captures(ret: address, provenance) initializes((8, 9), (24, 25), (32, 34), (48, 49)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Root) #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  %oldValue = load ptr, ptr %dest, align 8
  store ptr %0, ptr %dest, align 8
  tail call void @swift_release(ptr %oldValue) #11
  %dest.selected.value = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.selected.value = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load i1, ptr %src.selected.value, align 8
  %2 = zext i1 %1 to i8
  store i8 %2, ptr %dest.selected.value, align 8
  %dest.other = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.other = getelementptr inbounds nuw i8, ptr %src, i64 16
  %3 = load ptr, ptr %src.other, align 8
  %oldValue1 = load ptr, ptr %dest.other, align 8
  store ptr %3, ptr %dest.other, align 8
  tail call void @swift_release(ptr %oldValue1) #11
  %dest.other.value = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.other.value = getelementptr inbounds nuw i8, ptr %src, i64 24
  %4 = load i1, ptr %src.other.value, align 8
  %5 = zext i1 %4 to i8
  store i8 %5, ptr %dest.other.value, align 8
  %dest.two = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.two = getelementptr inbounds nuw i8, ptr %src, i64 32
  %6 = load i1, ptr %src.two, align 8
  %7 = zext i1 %6 to i8
  store i8 %7, ptr %dest.two, align 8
  %dest.two.second = getelementptr inbounds nuw i8, ptr %dest, i64 33
  %src.two.second = getelementptr inbounds nuw i8, ptr %src, i64 33
  %8 = load i1, ptr %src.two.second, align 1
  %9 = zext i1 %8 to i8
  store i8 %9, ptr %dest.two.second, align 1
  %dest.two.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 40
  %src.two.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 40
  %10 = load ptr, ptr %src.two.keyPath, align 8
  %oldValue2 = load ptr, ptr %dest.two.keyPath, align 8
  store ptr %10, ptr %dest.two.keyPath, align 8
  tail call void @swift_release(ptr %oldValue2) #11
  %dest.three = getelementptr inbounds nuw i8, ptr %dest, i64 48
  %src.three = getelementptr inbounds nuw i8, ptr %src, i64 48
  %11 = load i1, ptr %src.three, align 8
  %12 = zext i1 %11 to i8
  store i8 %12, ptr %dest.three, align 8
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s14OwnedTemplates4RootVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Root) #7 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 49
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i392, ptr %value, align 1
  %9 = trunc i392 %8 to i32
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
define internal void @"$s14OwnedTemplates4RootVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Root) #2 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 49
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 1
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
  %12 = zext nneg i32 %11 to i392
  store i392 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 1
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14OwnedTemplates4RootVMa"(i64 %0) #10 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32 }>, ptr @"$s14OwnedTemplates4RootVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline nounwind willreturn memory(read)
define linkonce_odr hidden swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr %3, ptr %4) local_unnamed_addr #16 {
entry:
  %generic.arguments = alloca [3 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 24, ptr nonnull %generic.arguments)
  store ptr %1, ptr %generic.arguments, align 8
  %5 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 8
  store ptr %2, ptr %5, align 8
  %6 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 16
  store ptr %3, ptr %6, align 8
  %7 = call swiftcc %swift.metadata_response @swift_getGenericMetadata(i64 %0, ptr nonnull %generic.arguments, ptr %4) #22
  ret %swift.metadata_response %7
}

; Function Attrs: nofree nounwind memory(read)
declare swiftcc %swift.metadata_response @swift_getGenericMetadata(i64, ptr, ptr) local_unnamed_addr #17

; Function Attrs: nocallback nofree nosync nounwind willreturn memory(inaccessiblemem: write)
declare void @llvm.assume(i1 noundef) #18

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i32 @llvm.umax.i32(i32, i32) #19

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i64 @llvm.umin.i64(i64, i64) #19

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s14OwnedTemplates6ValuesVwst"(ptr noalias writeonly captures(none) %0, i32 %1, i32 %2, ptr readnone captures(none) %3) #2 {
  tail call void @"$s14OwnedTemplates6ClientVwst"(ptr noalias writeonly captures(none) %0, i32 %1, i32 %2, ptr readnone captures(none) %3) #2
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14OwnedTemplates6NestedV5InnerV7keyPaths03KeyF0Cyxqd__Gvg"(ptr returned %0, ptr readnone captures(none) %1, ptr readnone captures(none) %2) #3 {
  %4 = tail call swiftcc ptr @"$s14OwnedTemplates11ConstrainedV7keyPaths03KeyE0CyAA6ValuesVxGvg"(ptr returned %0, ptr readnone captures(none) %1, ptr readnone captures(none) %2) #3
  ret ptr %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s14OwnedTemplates6ValuesVwet"(ptr noalias readonly captures(none) %0, i32 %1, ptr readnone captures(none) %2) #7 {
  %4 = tail call i32 @"$s14OwnedTemplates6ClientVwet"(ptr noalias readonly captures(none) %0, i32 %1, ptr readnone captures(none) %2) #7
  ret i32 %4
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates5ThreeVMi"(ptr %0, ptr %1, ptr %2) #8 {
  %4 = tail call ptr @"$s14OwnedTemplates3TwoVMi"(ptr %0, ptr %1, ptr %2) #8
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates7ForeignO10DependencyVMi"(ptr %0, ptr %1, ptr %2) #8 {
  %4 = tail call ptr @"$s14OwnedTemplates10DependencyVMi"(ptr %0, ptr %1, ptr %2) #8
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s14OwnedTemplates6NestedV5InnerVMi"(ptr %0, ptr %1, ptr %2) #8 {
  %4 = tail call ptr @"$s14OwnedTemplates11ConstrainedVMi"(ptr %0, ptr %1, ptr %2) #8
  ret ptr %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14OwnedTemplates6ValuesV4flagSbvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(1) initializes((0, 1)) %1) #2 {
  tail call swiftcc void @"$s14OwnedTemplates6ClientV4flagSbvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(1) initializes((0, 1)) %1) #2
  ret void
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #3 = { mustprogress nounwind willreturn "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #4 = { mustprogress nounwind willreturn }
attributes #5 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #6 = { mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite) }
attributes #7 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #8 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #9 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #10 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { nounwind }
attributes #12 = { nofree nounwind memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #13 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: write) }
attributes #14 = { mustprogress nofree noinline nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #15 = { mustprogress nofree nounwind willreturn memory(read) }
attributes #16 = { mustprogress nofree noinline nounwind willreturn memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #17 = { nofree nounwind memory(read) }
attributes #18 = { nocallback nofree nosync nounwind willreturn memory(inaccessiblemem: write) }
attributes #19 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #20 = { nounwind willreturn }
attributes #21 = { nounwind willreturn memory(read) }
attributes #22 = { nounwind memory(read) }
attributes #23 = { nounwind memory(none) }

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
