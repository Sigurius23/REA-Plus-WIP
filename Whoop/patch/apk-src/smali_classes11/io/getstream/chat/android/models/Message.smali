.class public final Lio/getstream/chat/android/models/Message;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/Message$Builder;,
        Lio/getstream/chat/android/models/Message$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008F\n\u0002\u0010\u000f\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u00087\u0008\u0087\u0008\u0018\u0000 \u00ce\u00012\u00020\u00012\u00020\u0002:\u0004\u00ce\u0001\u00cf\u0001B\u00f5\u0004\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u000f\u0012\u0014\u0008\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020(\u0012\u0008\u0008\u0002\u0010)\u001a\u00020(\u0012\u0014\u0008\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0008\u0008\u0002\u0010+\u001a\u00020(\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u00100\u001a\u00020(\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0008\u0008\u0002\u00105\u001a\u00020(\u0012\u0008\u0008\u0002\u00106\u001a\u00020(\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\u000e\u0008\u0002\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010D\u001a\u00020(\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010\u0088\u0001\u001a\t\u0012\u0002\u0008\u0003\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0016J\u0010\u0010\u008b\u0001\u001a\u00020\u00042\u0007\u0010\u008c\u0001\u001a\u00020\u0004JD\u0010\u008f\u0001\u001a\u0003H\u0090\u0001\"\u0005\u0008\u0000\u0010\u0091\u0001\"\u0005\u0008\u0001\u0010\u0090\u0001*\u0010\u0012\u0005\u0012\u0003H\u0091\u0001\u0012\u0005\u0012\u0003H\u0090\u00010\u00142\u0008\u0010\u0092\u0001\u001a\u0003H\u0091\u00012\u0008\u0010\u0093\u0001\u001a\u0003H\u0090\u0001H\u0002\u00a2\u0006\u0003\u0010\u0094\u0001J\u0008\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020\u0004H\u0016J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0007J\n\u0010\u009a\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0004H\u00c6\u0003J\u000c\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000c\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u00a0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u0010\u0010\u00a1\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000bH\u00c6\u0003J\u0010\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0011H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0011H\u00c6\u0003J\u0016\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u00c6\u0003J\u0016\u0010\u00a6\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u00c6\u0003J\u0016\u0010\u00a7\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u00aa\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000bH\u00c6\u0003J\u0010\u0010\u00ab\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000bH\u00c6\u0003J\u000c\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u000fH\u00c6\u0003J\u0016\u0010\u00b2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020(H\u00c6\u0003J\u0016\u0010\u00b5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020(H\u00c6\u0003J\u000c\u0010\u00b7\u0001\u001a\u0004\u0018\u00010-H\u00c6\u0003J\u000c\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0000H\u00c6\u0003J\u000c\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020(H\u00c6\u0003J\u000c\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010\u00be\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000bH\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020(H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020(H\u00c6\u0003J\u000c\u0010\u00c1\u0001\u001a\u0004\u0018\u000108H\u00c6\u0003J\u000c\u0010\u00c2\u0001\u001a\u0004\u0018\u00010:H\u00c6\u0003J\u000c\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000c\u0010\u00c4\u0001\u001a\u0004\u0018\u00010=H\u00c6\u0003J\u0010\u0010\u00c5\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000bH\u00c6\u0003J\u000c\u0010\u00c6\u0001\u001a\u0004\u0018\u00010@H\u00c6\u0003J\u000c\u0010\u00c7\u0001\u001a\u0004\u0018\u00010BH\u00c6\u0003J\u000c\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020(H\u00c6\u0003J\u00f8\u0004\u0010\u00ca\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\u0008\u0008\u0002\u0010$\u001a\u00020\u000f2\u0014\u0008\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u00142\u0008\u0008\u0002\u0010\'\u001a\u00020(2\u0008\u0008\u0002\u0010)\u001a\u00020(2\u0014\u0008\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0008\u0008\u0002\u0010+\u001a\u00020(2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u00100\u001a\u00020(2\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b2\u0008\u0008\u0002\u00105\u001a\u00020(2\u0008\u0008\u0002\u00106\u001a\u00020(2\n\u0008\u0002\u00107\u001a\u0004\u0018\u0001082\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010:2\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010=2\u000e\u0008\u0002\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b2\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010D\u001a\u00020(H\u00c6\u0001J\u0015\u0010\u00cb\u0001\u001a\u00020(2\t\u0010\u00cc\u0001\u001a\u0004\u0018\u00010&H\u00d6\u0003J\n\u0010\u00cd\u0001\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010HR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010HR\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010HR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010HR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010HR\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010OR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010OR\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010OR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010SR\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010SR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010VR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010VR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010VR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Y\u0010ZR\u0011\u0010\u001a\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010HR\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010OR\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008]\u0010OR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010_R\u0013\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010_R\u0013\u0010!\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010_R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010_R\u001c\u0010#\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008c\u0010_\"\u0004\u0008d\u0010eR\u0011\u0010$\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008f\u0010gR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u0010VR\u0011\u0010\'\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008i\u0010jR\u0011\u0010)\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010jR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008l\u0010VR\u0011\u0010+\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010jR\u0013\u0010,\u001a\u0004\u0018\u00010-\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010oR\u0013\u0010.\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010qR\u0013\u0010/\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010HR\u0011\u00100\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008s\u0010jR\u0013\u00101\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010_R\u0013\u00102\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008u\u0010_R\u0013\u00103\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008v\u0010gR\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008w\u0010OR\u0011\u00105\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008x\u0010jR\u0011\u00106\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008y\u0010jR\u0013\u00107\u001a\u0004\u0018\u000108\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008z\u0010{R\u0013\u00109\u001a\u0004\u0018\u00010:\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008|\u0010}R\u0013\u0010;\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008~\u0010_R\u0014\u0010<\u001a\u0004\u0018\u00010=\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u007f\u0010\u0080\u0001R\u0018\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0081\u0001\u0010OR\u0015\u0010?\u001a\u0004\u0018\u00010@\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0014\u0010C\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0086\u0001\u0010HR\u0012\u0010D\u001a\u00020(\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0087\u0001\u0010jR\u0013\u0010\u008d\u0001\u001a\u00020\u00048F\u00a2\u0006\u0007\u001a\u0005\u0008\u008e\u0001\u0010H\u00a8\u0006\u00d0\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "id",
        "",
        "cid",
        "text",
        "html",
        "parentId",
        "command",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "mentionedUsersIds",
        "mentionedUsers",
        "Lio/getstream/chat/android/models/User;",
        "replyCount",
        "",
        "deletedReplyCount",
        "reactionCounts",
        "",
        "reactionScores",
        "reactionGroups",
        "Lio/getstream/chat/android/models/ReactionGroup;",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "type",
        "latestReactions",
        "Lio/getstream/chat/android/models/Reaction;",
        "ownReactions",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "deletedAt",
        "updatedLocallyAt",
        "createdLocallyAt",
        "user",
        "extraData",
        "",
        "silent",
        "",
        "shadowed",
        "i18n",
        "showInChannel",
        "channelInfo",
        "Lio/getstream/chat/android/models/ChannelInfo;",
        "replyTo",
        "replyMessageId",
        "pinned",
        "pinnedAt",
        "pinExpires",
        "pinnedBy",
        "threadParticipants",
        "skipPushNotification",
        "skipEnrichUrl",
        "moderationDetails",
        "Lio/getstream/chat/android/models/MessageModerationDetails;",
        "moderation",
        "Lio/getstream/chat/android/models/Moderation;",
        "messageTextUpdatedAt",
        "poll",
        "Lio/getstream/chat/android/models/Poll;",
        "restrictedVisibility",
        "reminder",
        "Lio/getstream/chat/android/models/MessageReminderInfo;",
        "sharedLocation",
        "Lio/getstream/chat/android/models/Location;",
        "channelRole",
        "deletedForMe",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V",
        "getId",
        "()Ljava/lang/String;",
        "getCid",
        "getText",
        "getHtml",
        "getParentId",
        "getCommand",
        "getAttachments",
        "()Ljava/util/List;",
        "getMentionedUsersIds",
        "getMentionedUsers",
        "getReplyCount",
        "()I",
        "getDeletedReplyCount",
        "getReactionCounts",
        "()Ljava/util/Map;",
        "getReactionScores",
        "getReactionGroups",
        "getSyncStatus",
        "()Lio/getstream/chat/android/models/SyncStatus;",
        "getType",
        "getLatestReactions",
        "getOwnReactions",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getDeletedAt",
        "getUpdatedLocallyAt",
        "getCreatedLocallyAt",
        "setCreatedLocallyAt",
        "(Ljava/util/Date;)V",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getExtraData",
        "getSilent",
        "()Z",
        "getShadowed",
        "getI18n",
        "getShowInChannel",
        "getChannelInfo",
        "()Lio/getstream/chat/android/models/ChannelInfo;",
        "getReplyTo",
        "()Lio/getstream/chat/android/models/Message;",
        "getReplyMessageId",
        "getPinned",
        "getPinnedAt",
        "getPinExpires",
        "getPinnedBy",
        "getThreadParticipants",
        "getSkipPushNotification",
        "getSkipEnrichUrl",
        "getModerationDetails",
        "()Lio/getstream/chat/android/models/MessageModerationDetails;",
        "getModeration",
        "()Lio/getstream/chat/android/models/Moderation;",
        "getMessageTextUpdatedAt",
        "getPoll",
        "()Lio/getstream/chat/android/models/Poll;",
        "getRestrictedVisibility",
        "getReminder",
        "()Lio/getstream/chat/android/models/MessageReminderInfo;",
        "getSharedLocation",
        "()Lio/getstream/chat/android/models/Location;",
        "getChannelRole",
        "getDeletedForMe",
        "getComparableField",
        "",
        "fieldName",
        "getTranslation",
        "language",
        "originalLanguage",
        "getOriginalLanguage",
        "get",
        "B",
        "A",
        "key",
        "default",
        "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "identifierHash",
        "",
        "toString",
        "newBuilder",
        "Lio/getstream/chat/android/models/Message$Builder;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "copy",
        "equals",
        "other",
        "hashCode",
        "Companion",
        "Builder",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/models/Message$Companion;

.field public static final TYPE_EPHEMERAL:Ljava/lang/String; = "ephemeral"

.field public static final TYPE_ERROR:Ljava/lang/String; = "error"

.field public static final TYPE_REGULAR:Ljava/lang/String; = "regular"


# instance fields
.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

.field private final channelRole:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final command:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private createdLocallyAt:Ljava/util/Date;

.field private final deletedAt:Ljava/util/Date;

.field private final deletedForMe:Z

.field private final deletedReplyCount:I

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final html:Ljava/lang/String;

.field private final i18n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final latestReactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private final mentionedUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final mentionedUsersIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final messageTextUpdatedAt:Ljava/util/Date;

.field private final moderation:Lio/getstream/chat/android/models/Moderation;

.field private final moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

.field private final ownReactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private final parentId:Ljava/lang/String;

.field private final pinExpires:Ljava/util/Date;

.field private final pinned:Z

.field private final pinnedAt:Ljava/util/Date;

.field private final pinnedBy:Lio/getstream/chat/android/models/User;

.field private final poll:Lio/getstream/chat/android/models/Poll;

.field private final reactionCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionGroups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionScores:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

.field private final replyCount:I

.field private final replyMessageId:Ljava/lang/String;

.field private final replyTo:Lio/getstream/chat/android/models/Message;

.field private final restrictedVisibility:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shadowed:Z

.field private final sharedLocation:Lio/getstream/chat/android/models/Location;

.field private final showInChannel:Z

.field private final silent:Z

.field private final skipEnrichUrl:Z

.field private final skipPushNotification:Z

.field private final syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private final text:Ljava/lang/String;

.field private final threadParticipants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;

.field private final updatedLocallyAt:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/models/Message$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/Message$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/Message;->Companion:Lio/getstream/chat/android/models/Message$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 52

    .line 1
    const v50, 0xffff

    const/16 v51, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v51}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/ChannelInfo;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/MessageModerationDetails;",
            "Lio/getstream/chat/android/models/Moderation;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Poll;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/MessageReminderInfo;",
            "Lio/getstream/chat/android/models/Location;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-object/from16 v13, p17

    move-object/from16 v14, p18

    move-object/from16 v15, p24

    const-string v0, "id"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersIds"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsers"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionCounts"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionScores"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionGroups"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReactions"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownReactions"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v15, p25

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    move-object/from16 v15, p28

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    move-object/from16 v15, p37

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restrictedVisibility"

    move-object/from16 v15, p44

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 3
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    .line 5
    iput-object v3, v0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    .line 6
    iput-object v4, v0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    move-object/from16 v1, p5

    .line 7
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    move-object/from16 v1, p6

    .line 8
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    .line 9
    iput-object v5, v0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    .line 10
    iput-object v6, v0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    .line 11
    iput-object v7, v0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    move/from16 v1, p10

    .line 12
    iput v1, v0, Lio/getstream/chat/android/models/Message;->replyCount:I

    move/from16 v1, p11

    .line 13
    iput v1, v0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    .line 14
    iput-object v8, v0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    .line 15
    iput-object v9, v0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    .line 16
    iput-object v10, v0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    .line 17
    iput-object v11, v0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 18
    iput-object v12, v0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    .line 19
    iput-object v13, v0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    .line 20
    iput-object v14, v0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    move-object/from16 v1, p19

    .line 21
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    move-object/from16 v1, p20

    .line 22
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    move-object/from16 v1, p21

    .line 23
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    move-object/from16 v1, p22

    .line 24
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    move-object/from16 v1, p23

    .line 25
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    move-object/from16 v1, p24

    .line 26
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    move-object/from16 v1, p25

    .line 27
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    move/from16 v1, p26

    .line 28
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->silent:Z

    move/from16 v1, p27

    .line 29
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    move-object/from16 v1, p28

    .line 30
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    move/from16 v1, p29

    .line 31
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    move-object/from16 v1, p30

    .line 32
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    move-object/from16 v1, p31

    .line 33
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    move-object/from16 v1, p32

    .line 34
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    move/from16 v1, p33

    .line 35
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->pinned:Z

    move-object/from16 v1, p34

    .line 36
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    move-object/from16 v1, p35

    .line 37
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    move-object/from16 v1, p36

    .line 38
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v1, p37

    .line 39
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    move/from16 v1, p38

    .line 40
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    move/from16 v1, p39

    .line 41
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    move-object/from16 v1, p40

    .line 42
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    move-object/from16 v1, p41

    .line 43
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    move-object/from16 v1, p42

    .line 44
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    move-object/from16 v1, p43

    .line 45
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    .line 46
    iput-object v15, v0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    move-object/from16 v1, p45

    .line 47
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    move-object/from16 v1, p46

    .line 48
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    move-object/from16 v1, p47

    .line 49
    iput-object v1, v0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    move/from16 v1, p48

    .line 50
    iput-boolean v1, v0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 54

    move/from16 v0, p49

    move/from16 v1, p50

    and-int/lit8 v2, v0, 0x1

    .line 51
    const-string v3, ""

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    move-object v4, v3

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    move-object v5, v3

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v3

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    sget-object v11, Lm83/y;->w:Lm83/y;

    if-eqz v10, :cond_6

    move-object v10, v11

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    move-object v12, v11

    goto :goto_7

    :cond_7
    move-object/from16 v12, p8

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    move-object v13, v11

    goto :goto_8

    :cond_8
    move-object/from16 v13, p9

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move/from16 v14, p10

    :goto_9
    and-int/lit16 v8, v0, 0x400

    if-eqz v8, :cond_a

    const/4 v8, 0x0

    goto :goto_a

    :cond_a
    move/from16 v8, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    sget-object v16, Lm83/z;->w:Lm83/z;

    if-eqz v15, :cond_b

    move-object/from16 v15, v16

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    move-object/from16 p51, v2

    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_c

    move-object/from16 v2, v16

    goto :goto_c

    :cond_c
    move-object/from16 v2, p13

    :goto_c
    move-object/from16 p3, v2

    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    move-object/from16 v2, v16

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    move-object/from16 p4, v2

    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    .line 52
    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v17, 0x8000

    and-int v18, v0, v17

    if-eqz v18, :cond_f

    goto :goto_f

    :cond_f
    move-object/from16 v3, p16

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    move-object/from16 v18, v11

    goto :goto_10

    :cond_10
    move-object/from16 v18, p17

    :goto_10
    const/high16 v19, 0x20000

    and-int v19, v0, v19

    if-eqz v19, :cond_11

    move-object/from16 v19, v11

    goto :goto_11

    :cond_11
    move-object/from16 v19, p18

    :goto_11
    const/high16 v20, 0x40000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    const/16 v20, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v20, p19

    :goto_12
    const/high16 v21, 0x80000

    and-int v21, v0, v21

    if-eqz v21, :cond_13

    const/16 v21, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v21, p20

    :goto_13
    const/high16 v22, 0x100000

    and-int v22, v0, v22

    if-eqz v22, :cond_14

    const/16 v22, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v22, p21

    :goto_14
    const/high16 v23, 0x200000

    and-int v23, v0, v23

    if-eqz v23, :cond_15

    const/16 v23, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v23, p22

    :goto_15
    const/high16 v24, 0x400000

    and-int v24, v0, v24

    if-eqz v24, :cond_16

    const/16 v24, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v24, p23

    :goto_16
    const/high16 v25, 0x800000

    and-int v25, v0, v25

    if-eqz v25, :cond_17

    .line 53
    new-instance v26, Lio/getstream/chat/android/models/User;

    const v52, 0x1ffffff

    const/16 v53, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v26 .. v53}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_17

    :cond_17
    move-object/from16 v26, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    move-object/from16 v25, v16

    goto :goto_18

    :cond_18
    move-object/from16 v25, p25

    :goto_18
    const/high16 v27, 0x2000000

    and-int v27, v0, v27

    if-eqz v27, :cond_19

    const/16 v27, 0x0

    goto :goto_19

    :cond_19
    move/from16 v27, p26

    :goto_19
    const/high16 v28, 0x4000000

    and-int v28, v0, v28

    if-eqz v28, :cond_1a

    const/16 v28, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v28, p27

    :goto_1a
    const/high16 v29, 0x8000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1b

    goto :goto_1b

    :cond_1b
    move-object/from16 v16, p28

    :goto_1b
    const/high16 v29, 0x10000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1c

    const/16 v29, 0x0

    goto :goto_1c

    :cond_1c
    move/from16 v29, p29

    :goto_1c
    const/high16 v30, 0x20000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1d

    const/16 v30, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v30, p30

    :goto_1d
    const/high16 v31, 0x40000000    # 2.0f

    and-int v31, v0, v31

    if-eqz v31, :cond_1e

    const/16 v31, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v31, p31

    :goto_1e
    const/high16 v32, -0x80000000

    and-int v0, v0, v32

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p32

    :goto_1f
    and-int/lit8 v32, v1, 0x1

    if-eqz v32, :cond_20

    const/16 v32, 0x0

    goto :goto_20

    :cond_20
    move/from16 v32, p33

    :goto_20
    and-int/lit8 v33, v1, 0x2

    if-eqz v33, :cond_21

    const/16 v33, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v33, p34

    :goto_21
    and-int/lit8 v34, v1, 0x4

    if-eqz v34, :cond_22

    const/16 v34, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v34, p35

    :goto_22
    and-int/lit8 v35, v1, 0x8

    if-eqz v35, :cond_23

    const/16 v35, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v35, p36

    :goto_23
    and-int/lit8 v36, v1, 0x10

    if-eqz v36, :cond_24

    move-object/from16 v36, v11

    goto :goto_24

    :cond_24
    move-object/from16 v36, p37

    :goto_24
    and-int/lit8 v37, v1, 0x20

    if-eqz v37, :cond_25

    const/16 v37, 0x0

    goto :goto_25

    :cond_25
    move/from16 v37, p38

    :goto_25
    and-int/lit8 v38, v1, 0x40

    if-eqz v38, :cond_26

    const/16 v38, 0x0

    goto :goto_26

    :cond_26
    move/from16 v38, p39

    :goto_26
    move-object/from16 p5, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move-object/from16 v0, p40

    :goto_27
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    const/4 v0, 0x0

    goto :goto_28

    :cond_28
    move-object/from16 v0, p41

    :goto_28
    move-object/from16 p7, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_29

    :cond_29
    move-object/from16 v0, p42

    :goto_29
    move-object/from16 p8, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move-object/from16 v0, p43

    :goto_2a
    move-object/from16 p9, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    goto :goto_2b

    :cond_2b
    move-object/from16 v11, p44

    :goto_2b
    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p45

    :goto_2c
    move-object/from16 p10, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move-object/from16 v0, p46

    :goto_2d
    move-object/from16 p11, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p47

    :goto_2e
    and-int v1, v1, v17

    if-eqz v1, :cond_2f

    const/16 p49, 0x0

    :goto_2f
    move-object/from16 p1, p0

    move-object/from16 p14, p3

    move-object/from16 p15, p4

    move-object/from16 p33, p5

    move-object/from16 p41, p6

    move-object/from16 p42, p7

    move-object/from16 p43, p8

    move-object/from16 p44, p9

    move-object/from16 p46, p10

    move-object/from16 p47, p11

    move-object/from16 p2, p51

    move-object/from16 p48, v0

    move-object/from16 p16, v2

    move-object/from16 p17, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p12, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p45, v11

    move-object/from16 p9, v12

    move-object/from16 p10, v13

    move/from16 p11, v14

    move-object/from16 p13, v15

    move-object/from16 p29, v16

    move-object/from16 p18, v18

    move-object/from16 p19, v19

    move-object/from16 p20, v20

    move-object/from16 p21, v21

    move-object/from16 p22, v22

    move-object/from16 p23, v23

    move-object/from16 p24, v24

    move-object/from16 p26, v25

    move-object/from16 p25, v26

    move/from16 p27, v27

    move/from16 p28, v28

    move/from16 p30, v29

    move-object/from16 p31, v30

    move-object/from16 p32, v31

    move/from16 p34, v32

    move-object/from16 p35, v33

    move-object/from16 p36, v34

    move-object/from16 p37, v35

    move-object/from16 p38, v36

    move/from16 p39, v37

    move/from16 p40, v38

    goto :goto_30

    :cond_2f
    move/from16 p49, p48

    goto :goto_2f

    .line 54
    :goto_30
    invoke-direct/range {p1 .. p49}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p49

    move/from16 v2, p50

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lio/getstream/chat/android/models/Message;->replyCount:I

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, p49, v17

    move-object/from16 p3, v1

    if-eqz v17, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v17, 0x20000

    and-int v17, p49, v17

    move-object/from16 p4, v1

    if-eqz v17, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v17, 0x40000

    and-int v17, p49, v17

    move-object/from16 p5, v1

    if-eqz v17, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v17, 0x80000

    and-int v17, p49, v17

    move-object/from16 p6, v1

    if-eqz v17, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v17, 0x100000

    and-int v17, p49, v17

    move-object/from16 p7, v1

    if-eqz v17, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v17, 0x200000

    and-int v17, p49, v17

    move-object/from16 p8, v1

    if-eqz v17, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v17, 0x400000

    and-int v17, p49, v17

    move-object/from16 p9, v1

    if-eqz v17, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v17, 0x800000

    and-int v17, p49, v17

    move-object/from16 p10, v1

    if-eqz v17, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v17, 0x1000000

    and-int v17, p49, v17

    move-object/from16 p11, v1

    if-eqz v17, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v17, 0x2000000

    and-int v17, p49, v17

    move-object/from16 p12, v1

    if-eqz v17, :cond_19

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->silent:Z

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v17, 0x4000000

    and-int v17, p49, v17

    move/from16 p13, v1

    if-eqz v17, :cond_1a

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v17, 0x8000000

    and-int v17, p49, v17

    move/from16 p14, v1

    if-eqz v17, :cond_1b

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v17, 0x10000000

    and-int v17, p49, v17

    move-object/from16 p15, v1

    if-eqz v17, :cond_1c

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v17, 0x20000000

    and-int v17, p49, v17

    move/from16 p16, v1

    if-eqz v17, :cond_1d

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v17, 0x40000000    # 2.0f

    and-int v17, p49, v17

    move-object/from16 p17, v1

    if-eqz v17, :cond_1e

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v17, -0x80000000

    and-int v17, p49, v17

    move-object/from16 p18, v1

    if-eqz v17, :cond_1f

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v17, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v17, :cond_20

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->pinned:Z

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v17, v2, 0x2

    move/from16 p20, v1

    if-eqz v17, :cond_21

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v17, v2, 0x4

    move-object/from16 p21, v1

    if-eqz v17, :cond_22

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v17, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v17, :cond_23

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v17, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v17, :cond_24

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v17, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v17, :cond_25

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    goto :goto_25

    :cond_25
    move/from16 v1, p38

    :goto_25
    and-int/lit8 v17, v2, 0x40

    move/from16 p25, v1

    if-eqz v17, :cond_26

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    goto :goto_26

    :cond_26
    move/from16 v1, p39

    :goto_26
    move/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p33, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v2, v2, v16

    if-eqz v2, :cond_2f

    iget-boolean v2, v0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    move/from16 p49, v2

    :goto_2f
    move/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move/from16 p39, p25

    move/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, p30

    move-object/from16 p45, p31

    move-object/from16 p46, p32

    move-object/from16 p47, p33

    move-object/from16 p48, v1

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move-object/from16 p25, p11

    move-object/from16 p26, p12

    move/from16 p27, p13

    move/from16 p28, p14

    move-object/from16 p29, p15

    move/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p16, v3

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, p5

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_30

    :cond_2f
    move/from16 p49, p48

    goto :goto_2f

    :goto_30
    invoke-virtual/range {p1 .. p49}, Lio/getstream/chat/android/models/Message;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method private final get(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TA;+TB;>;TA;TB;)TB;"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    return v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component21()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component22()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component23()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component24()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component25()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    return v0
.end method

.method public final component27()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    return v0
.end method

.method public final component28()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final component29()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Lio/getstream/chat/android/models/ChannelInfo;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    return-object v0
.end method

.method public final component31()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    return v0
.end method

.method public final component34()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component35()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final component36()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component37()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final component38()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    return v0
.end method

.method public final component39()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Lio/getstream/chat/android/models/MessageModerationDetails;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    return-object v0
.end method

.method public final component41()Lio/getstream/chat/android/models/Moderation;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    return-object v0
.end method

.method public final component42()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component43()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final component44()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    return-object v0
.end method

.method public final component45()Lio/getstream/chat/android/models/MessageReminderInfo;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    return-object v0
.end method

.method public final component46()Lio/getstream/chat/android/models/Location;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    return-object v0
.end method

.method public final component47()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final component48()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)Lio/getstream/chat/android/models/Message;
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/ChannelInfo;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/MessageModerationDetails;",
            "Lio/getstream/chat/android/models/Moderation;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Poll;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/MessageReminderInfo;",
            "Lio/getstream/chat/android/models/Location;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/getstream/chat/android/models/Message;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersIds"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsers"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionCounts"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionScores"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionGroups"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v6, p16

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReactions"

    move-object/from16 v7, p17

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownReactions"

    move-object/from16 v11, p18

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v12, p24

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v1, p25

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    move-object/from16 v1, p28

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    move-object/from16 v1, p37

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restrictedVisibility"

    move-object/from16 v1, p44

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/Message;

    move-object/from16 v16, p15

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move-object/from16 v29, p28

    move/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move/from16 v34, p33

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move/from16 v39, p38

    move/from16 v40, p39

    move-object/from16 v41, p40

    move-object/from16 v42, p41

    move-object/from16 v43, p42

    move-object/from16 v44, p43

    move-object/from16 v45, p44

    move-object/from16 v46, p45

    move-object/from16 v47, p46

    move-object/from16 v48, p47

    move/from16 v49, p48

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v11

    move-object/from16 v25, v12

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v49}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/Message;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Message;->replyCount:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->silent:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->shadowed:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->pinned:Z

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    if-eq v1, p1, :cond_31

    return v2

    :cond_31
    return v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    return-object v0
.end method

.method public final getChannelRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    return-object v0
.end method

.method public getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "deleted_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "pinExpires"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "updated_locally_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "pin_expires"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    return-object p1

    :sswitch_6
    const-string v0, "parentId"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    return-object p1

    :sswitch_7
    const-string v0, "command"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    return-object p1

    :sswitch_8
    const-string v0, "createdAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    return-object p1

    :sswitch_9
    const-string v0, "deletedReplyCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "reply_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "type"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    return-object p1

    :sswitch_c
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    return-object p1

    :sswitch_d
    const-string v0, "html"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    return-object p1

    :sswitch_e
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    return-object p1

    :sswitch_f
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    return-object p1

    :sswitch_10
    const-string v0, "created_locally_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "pinned_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "deletedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    return-object p1

    :sswitch_14
    const-string v0, "pinnedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    return-object p1

    :sswitch_15
    const-string v0, "replyCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    iget p1, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_16
    const-string v0, "updatedLocallyAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    return-object p1

    :sswitch_17
    const-string v0, "shadowed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    iget-boolean p1, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_18
    const-string v0, "deleted_reply_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget p1, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_19
    const-string v0, "silent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget-boolean p1, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_1a
    const-string v0, "pinned"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    iget-boolean p1, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_1b
    const-string v0, "createdLocallyAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    return-object p1

    :sswitch_1c
    const-string v0, "updatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_12

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_12
    const/4 p1, 0x0

    return-object p1

    :cond_13
    iget-object p1, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x742e59b2 -> :sswitch_1c
        -0x6dab017d -> :sswitch_1b
        -0x3ae5ec28 -> :sswitch_1a
        -0x35c86bab -> :sswitch_19
        -0x334f5fac -> :sswitch_18
        -0x2d154241 -> :sswitch_17
        -0x26fe05f0 -> :sswitch_16
        -0x22486fbb -> :sswitch_15
        -0x191b79d5 -> :sswitch_14
        -0x156169d4 -> :sswitch_13
        -0x119c6dc9 -> :sswitch_12
        -0xa535206 -> :sswitch_11
        -0x25ea2af -> :sswitch_10
        0xd1b -> :sswitch_f
        0x180be -> :sswitch_e
        0x3107ab -> :sswitch_d
        0x36452d -> :sswitch_c
        0x368f3a -> :sswitch_b
        0x8566f7a -> :sswitch_a
        0x204d113e -> :sswitch_9
        0x23aa6d3b -> :sswitch_8
        0x38a5df4b -> :sswitch_7
        0x460b8f65 -> :sswitch_6
        0x4a1b9a8a -> :sswitch_5
        0x4cfda99e -> :sswitch_4
        0x51a3a8ea -> :sswitch_3
        0x68238bdf -> :sswitch_2
        0x69349e19 -> :sswitch_1
        0x7b66b0d0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedLocallyAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeletedForMe()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    return v0
.end method

.method public final getDeletedReplyCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    return v0
.end method

.method public getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/models/CustomObject;->getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final getI18n()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatestReactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    return-object v0
.end method

.method public final getMentionedUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    return-object v0
.end method

.method public final getMentionedUsersIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    return-object v0
.end method

.method public final getMessageTextUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getModeration()Lio/getstream/chat/android/models/Moderation;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    return-object v0
.end method

.method public final getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    return-object v0
.end method

.method public final getOriginalLanguage()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    const-string v1, "language"

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/chat/android/models/Message;->get(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnReactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinExpires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    return v0
.end method

.method public final getPinnedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinnedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getPoll()Lio/getstream/chat/android/models/Poll;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    return-object v0
.end method

.method public final getReactionCounts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final getReactionGroups()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/ReactionGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    return-object v0
.end method

.method public final getReactionScores()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    return-object v0
.end method

.method public final getReminder()Lio/getstream/chat/android/models/MessageReminderInfo;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    return-object v0
.end method

.method public final getReplyCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    return v0
.end method

.method public final getReplyMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReplyTo()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getRestrictedVisibility()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    return-object v0
.end method

.method public final getShadowed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    return v0
.end method

.method public final getSharedLocation()Lio/getstream/chat/android/models/Location;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    return-object v0
.end method

.method public final getShowInChannel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    return v0
.end method

.method public final getSilent()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    return v0
.end method

.method public final getSkipEnrichUrl()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    return v0
.end method

.method public final getSkipPushNotification()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    return v0
.end method

.method public final getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getThreadParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final getTranslation(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    const-string v1, "_text"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-direct {p0, v0, p1, v1}, Lio/getstream/chat/android/models/Message;->get(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUpdatedLocallyAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->reactionGroups:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v2, v0, v1}, Ld13/a;->b(Lio/getstream/chat/android/models/User;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelInfo;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageModerationDetails;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Moderation;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->messageTextUpdatedAt:Ljava/util/Date;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->restrictedVisibility:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->reminder:Lio/getstream/chat/android/models/MessageReminderInfo;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageReminderInfo;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->sharedLocation:Lio/getstream/chat/android/models/Location;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Location;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    if-nez v2, :cond_13

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_13
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final identifierHash()J
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v1

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    :cond_3
    int-to-long v0, v0

    return-wide v0
.end method

.method public final newBuilder()Lio/getstream/chat/android/models/Message$Builder;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/Message$Builder;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/Message$Builder;-><init>(Lio/getstream/chat/android/models/Message;)V

    return-object v0
.end method

.method public final setCreatedLocallyAt(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Message(type=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", id=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", text=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", html=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->html:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", cid=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, ", parentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->parentId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, ", command="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->command:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ", attachments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->attachments:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ", mentionedUsersIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsersIds:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, ", mentionedUsers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->mentionedUsers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    if-lez v1, :cond_5

    const-string v1, ", replyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/getstream/chat/android/models/Message;->replyCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    if-lez v1, :cond_6

    const-string v1, ", deletedReplyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/getstream/chat/android/models/Message;->deletedReplyCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, ", reactionCounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionCounts:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, ", reactionScores="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->reactionScores:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_8
    const-string v1, ", syncStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, ", latestReactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->latestReactions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, ", ownReactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->ownReactions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    if-eqz v1, :cond_b

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    if-eqz v1, :cond_c

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    if-eqz v1, :cond_d

    const-string v1, ", deletedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->deletedAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    if-eqz v1, :cond_e

    const-string v1, ", updatedLocallyAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->updatedLocallyAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    if-eqz v1, :cond_f

    const-string v1, ", createdLocallyAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->createdLocallyAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_f
    const-string v1, ", sentBy=User(id=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"), silent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->silent:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shadowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->shadowed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    const-string v1, ", i18n="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->i18n:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_10
    const-string v1, ", showInChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->showInChannel:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    if-eqz v1, :cond_11

    const-string v1, ", channelInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelInfo:Lio/getstream/chat/android/models/ChannelInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    if-eqz v1, :cond_12

    const-string v1, ", replyMessageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyMessageId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    if-eqz v1, :cond_13

    const-string v1, ", replyTo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->replyTo:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_13
    const-string v1, ", pinned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->pinned:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    if-eqz v1, :cond_14

    const-string v1, ", pinnedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedAt:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    if-eqz v1, :cond_15

    const-string v1, ", pinExpires="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinExpires:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    if-eqz v1, :cond_16

    const-string v1, ", pinnedBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->pinnedBy:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_17

    const-string v1, ", threadParticipants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->threadParticipants:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_17
    const-string v1, ", skipPushNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->skipPushNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", skipEnrichUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->skipEnrichUrl:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    if-eqz v1, :cond_18

    const-string v1, ", moderationDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderationDetails:Lio/getstream/chat/android/models/MessageModerationDetails;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    if-eqz v1, :cond_19

    const-string v1, ", moderation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->moderation:Lio/getstream/chat/android/models/Moderation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    if-eqz v1, :cond_1a

    const-string v1, ", poll="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    if-eqz v1, :cond_1b

    const-string v1, ", channelRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/Message;->channelRole:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1b
    const-string v1, ", deletedForMe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/getstream/chat/android/models/Message;->deletedForMe:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1c
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
