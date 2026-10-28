.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008q\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ab\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018\u0012\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018\u0012\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u001f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u001f\u0012\u0014\u0008\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\'\u001a\u00020\u001f\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0008\u0008\u0002\u0010,\u001a\u00020\u001f\u0012\u0008\u0008\u0002\u0010-\u001a\u00020\u001f\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u00103\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010:\u001a\u00020\u001f\u00a2\u0006\u0004\u0008;\u0010<J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0003H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\nH\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u000cH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000cH\u00c6\u0003J\u000c\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u00c6\u0003J\u0010\u0010\u0087\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u00c6\u0003J\u0016\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018H\u00c6\u0003J\u0016\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018H\u00c6\u0003J\u0016\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018H\u00c6\u0003J\u000c\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u001fH\u00c6\u0003J\u0016\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001fH\u00c6\u0003J\u000c\u0010\u0090\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u001fH\u00c6\u0003J\u0016\u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018H\u00c6\u0003J\u000c\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001fH\u00c6\u0003J\u000c\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u001fH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u001fH\u00c6\u0003J\u000c\u0010\u009b\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\u000c\u0010\u009c\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\u000c\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000c\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u009f\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015H\u00c6\u0003J\u000c\u0010\u00a0\u0001\u001a\u0004\u0018\u000106H\u00c6\u0003J\u000c\u0010\u00a1\u0001\u001a\u0004\u0018\u000108H\u00c6\u0003J\u000c\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u001fH\u00c6\u0003J\u00bc\u0004\u0010\u00a4\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u00182\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u00182\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u00182\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u0014\u0008\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00182\u0008\u0008\u0002\u0010!\u001a\u00020\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0008\u0002\u0010$\u001a\u00020\u001f2\u0014\u0008\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00182\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\'\u001a\u00020\u001f2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\u0008\u0008\u0002\u0010,\u001a\u00020\u001f2\u0008\u0008\u0002\u0010-\u001a\u00020\u001f2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\u0008\u0002\u00100\u001a\u0004\u0018\u0001012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00152\n\u0008\u0002\u00105\u001a\u0004\u0018\u0001062\n\u0008\u0002\u00107\u001a\u0004\u0018\u0001082\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010:\u001a\u00020\u001fH\u00c6\u0001J\u0015\u0010\u00a5\u0001\u001a\u00020\u001f2\t\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u000cH\u00d6\u0001J\n\u0010\u00a8\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010>R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010>R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010>R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010>R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010>R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010GR\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010GR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010JR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010JR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010JR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010JR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010JR\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010PR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010PR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010SR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010SR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010SR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010>R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010>R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010SR\u0011\u0010!\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010YR\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010]R\u0011\u0010$\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010YR\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008_\u0010SR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008`\u0010>R\u0011\u0010\'\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010YR\u0013\u0010(\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010JR\u0013\u0010)\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008c\u0010JR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008d\u0010>R\u0017\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008e\u0010PR\u001a\u0010,\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008f\u0010Y\"\u0004\u0008g\u0010hR\u001a\u0010-\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010Y\"\u0004\u0008j\u0010hR\u0013\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010lR\u0013\u00100\u001a\u0004\u0018\u000101\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008m\u0010nR\u0013\u00102\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008o\u0010JR\u0013\u00103\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008p\u0010>R\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008q\u0010PR\u0013\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010sR\u0013\u00107\u001a\u0004\u0018\u000108\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010uR\u0013\u00109\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008v\u0010>R\u0011\u0010:\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008w\u0010Y\u00a8\u0006\u00a9\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
        "",
        "id",
        "",
        "cid",
        "userId",
        "text",
        "html",
        "type",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "replyCount",
        "",
        "deletedReplyCount",
        "createdAt",
        "Ljava/util/Date;",
        "createdLocallyAt",
        "updatedAt",
        "updatedLocallyAt",
        "deletedAt",
        "remoteMentionedUserIds",
        "",
        "mentionedUsersId",
        "reactionCounts",
        "",
        "reactionScores",
        "reactionGroups",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
        "parentId",
        "command",
        "shadowed",
        "",
        "i18n",
        "showInChannel",
        "channelInfo",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;",
        "silent",
        "extraData",
        "replyToId",
        "pinned",
        "pinnedAt",
        "pinExpires",
        "pinnedByUserId",
        "threadParticipantsIds",
        "skipPushNotification",
        "skipEnrichUrl",
        "moderationDetails",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
        "moderation",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;",
        "messageTextUpdatedAt",
        "pollId",
        "restrictedVisibility",
        "reminder",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
        "sharedLocation",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
        "channelRole",
        "deletedForMe",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V",
        "getId",
        "()Ljava/lang/String;",
        "getCid",
        "getUserId",
        "getText",
        "getHtml",
        "getType",
        "getSyncStatus",
        "()Lio/getstream/chat/android/models/SyncStatus;",
        "getReplyCount",
        "()I",
        "getDeletedReplyCount",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getCreatedLocallyAt",
        "getUpdatedAt",
        "getUpdatedLocallyAt",
        "getDeletedAt",
        "getRemoteMentionedUserIds",
        "()Ljava/util/List;",
        "getMentionedUsersId",
        "getReactionCounts",
        "()Ljava/util/Map;",
        "getReactionScores",
        "getReactionGroups",
        "getParentId",
        "getCommand",
        "getShadowed",
        "()Z",
        "getI18n",
        "getShowInChannel",
        "getChannelInfo",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;",
        "getSilent",
        "getExtraData",
        "getReplyToId",
        "getPinned",
        "getPinnedAt",
        "getPinExpires",
        "getPinnedByUserId",
        "getThreadParticipantsIds",
        "getSkipPushNotification",
        "setSkipPushNotification",
        "(Z)V",
        "getSkipEnrichUrl",
        "setSkipEnrichUrl",
        "getModerationDetails",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
        "getModeration",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;",
        "getMessageTextUpdatedAt",
        "getPollId",
        "getRestrictedVisibility",
        "getReminder",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
        "getSharedLocation",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
        "getChannelRole",
        "getDeletedForMe",
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
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

.field private final channelRole:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final command:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final createdLocallyAt:Ljava/util/Date;

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

.field private final mentionedUsersId:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final messageTextUpdatedAt:Ljava/util/Date;

.field private final moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

.field private final moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

.field private final parentId:Ljava/lang/String;

.field private final pinExpires:Ljava/util/Date;

.field private final pinned:Z

.field private final pinnedAt:Ljava/util/Date;

.field private final pinnedByUserId:Ljava/lang/String;

.field private final pollId:Ljava/lang/String;

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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
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

.field private final reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

.field private final remoteMentionedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final replyCount:I

.field private final replyToId:Ljava/lang/String;

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

.field private final sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

.field private final showInChannel:Z

.field private final silent:Z

.field private skipEnrichUrl:Z

.field private skipPushNotification:Z

.field private final syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private final text:Ljava/lang/String;

.field private final threadParticipantsIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;

.field private final updatedLocallyAt:Ljava/util/Date;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V
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
            "Lio/getstream/chat/android/models/SyncStatus;",
            "II",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p15

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    move-object/from16 v12, p19

    move-object/from16 v13, p23

    move-object/from16 v14, p27

    move-object/from16 v15, p33

    const-string v0, "id"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteMentionedUserIds"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersId"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionCounts"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionScores"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionGroups"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipantsIds"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restrictedVisibility"

    move-object/from16 v15, p40

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    .line 3
    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    .line 4
    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    .line 5
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    .line 6
    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    .line 7
    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    .line 8
    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    move/from16 v1, p8

    .line 9
    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    move/from16 v1, p9

    .line 10
    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    move-object/from16 v1, p10

    .line 11
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    move-object/from16 v1, p11

    .line 12
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    move-object/from16 v1, p12

    .line 13
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    move-object/from16 v1, p13

    .line 14
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    .line 16
    iput-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    .line 17
    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    .line 18
    iput-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    .line 19
    iput-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    .line 20
    iput-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    move/from16 v1, p22

    .line 23
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    .line 24
    iput-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    move/from16 v1, p24

    .line 25
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    move-object/from16 v1, p25

    .line 26
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move/from16 v1, p26

    .line 27
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    .line 28
    iput-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    move-object/from16 v1, p28

    .line 29
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    move/from16 v1, p29

    .line 30
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    move-object/from16 v1, p30

    .line 31
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    move-object/from16 v1, p31

    .line 32
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    move-object/from16 v1, p32

    .line 33
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    move-object/from16 v1, p33

    .line 34
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    move/from16 v1, p34

    .line 35
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    move/from16 v1, p35

    .line 36
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    move-object/from16 v1, p36

    .line 37
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-object/from16 v1, p37

    .line 38
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-object/from16 v1, p38

    .line 39
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    move-object/from16 v1, p39

    .line 40
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    .line 41
    iput-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    move-object/from16 v1, p41

    .line 42
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-object/from16 v1, p42

    .line 43
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-object/from16 v1, p43

    .line 44
    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    move/from16 v1, p44

    .line 45
    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 49

    move/from16 v0, p45

    move/from16 v1, p46

    and-int/lit8 v2, v0, 0x8

    .line 46
    const-string v3, ""

    if-eqz v2, :cond_0

    move-object v8, v3

    goto :goto_0

    :cond_0
    move-object/from16 v8, p4

    :goto_0
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_1

    move-object v9, v3

    goto :goto_1

    :cond_1
    move-object/from16 v9, p5

    :goto_1
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_2

    move-object v10, v3

    goto :goto_2

    :cond_2
    move-object/from16 v10, p6

    :goto_2
    and-int/lit8 v2, v0, 0x40

    if-eqz v2, :cond_3

    .line 47
    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p7

    :goto_3
    and-int/lit16 v2, v0, 0x80

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    move v12, v3

    goto :goto_4

    :cond_4
    move/from16 v12, p8

    :goto_4
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_5

    move v13, v3

    goto :goto_5

    :cond_5
    move/from16 v13, p9

    :goto_5
    and-int/lit16 v2, v0, 0x200

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    move-object v14, v4

    goto :goto_6

    :cond_6
    move-object/from16 v14, p10

    :goto_6
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_7

    move-object v15, v4

    goto :goto_7

    :cond_7
    move-object/from16 v15, p11

    :goto_7
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_8

    move-object/from16 v16, v4

    goto :goto_8

    :cond_8
    move-object/from16 v16, p12

    :goto_8
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_9

    move-object/from16 v17, v4

    goto :goto_9

    :cond_9
    move-object/from16 v17, p13

    :goto_9
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_a

    move-object/from16 v18, v4

    goto :goto_a

    :cond_a
    move-object/from16 v18, p14

    :goto_a
    and-int/lit16 v2, v0, 0x4000

    .line 48
    sget-object v5, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_b

    move-object/from16 v19, v5

    goto :goto_b

    :cond_b
    move-object/from16 v19, p15

    :goto_b
    const v2, 0x8000

    and-int/2addr v2, v0

    if-eqz v2, :cond_c

    move-object/from16 v20, v5

    goto :goto_c

    :cond_c
    move-object/from16 v20, p16

    :goto_c
    const/high16 v2, 0x10000

    and-int/2addr v2, v0

    sget-object v6, Lm83/z;->w:Lm83/z;

    if-eqz v2, :cond_d

    move-object/from16 v21, v6

    goto :goto_d

    :cond_d
    move-object/from16 v21, p17

    :goto_d
    const/high16 v2, 0x20000

    and-int/2addr v2, v0

    if-eqz v2, :cond_e

    move-object/from16 v22, v6

    goto :goto_e

    :cond_e
    move-object/from16 v22, p18

    :goto_e
    const/high16 v2, 0x40000

    and-int/2addr v2, v0

    if-eqz v2, :cond_f

    move-object/from16 v23, v6

    goto :goto_f

    :cond_f
    move-object/from16 v23, p19

    :goto_f
    const/high16 v2, 0x80000

    and-int/2addr v2, v0

    if-eqz v2, :cond_10

    move-object/from16 v24, v4

    goto :goto_10

    :cond_10
    move-object/from16 v24, p20

    :goto_10
    const/high16 v2, 0x100000

    and-int/2addr v2, v0

    if-eqz v2, :cond_11

    move-object/from16 v25, v4

    goto :goto_11

    :cond_11
    move-object/from16 v25, p21

    :goto_11
    const/high16 v2, 0x200000

    and-int/2addr v2, v0

    if-eqz v2, :cond_12

    move/from16 v26, v3

    goto :goto_12

    :cond_12
    move/from16 v26, p22

    :goto_12
    const/high16 v2, 0x400000

    and-int/2addr v2, v0

    if-eqz v2, :cond_13

    move-object/from16 v27, v6

    goto :goto_13

    :cond_13
    move-object/from16 v27, p23

    :goto_13
    const/high16 v2, 0x800000

    and-int/2addr v2, v0

    if-eqz v2, :cond_14

    move/from16 v28, v3

    goto :goto_14

    :cond_14
    move/from16 v28, p24

    :goto_14
    const/high16 v2, 0x1000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_15

    move-object/from16 v29, v4

    goto :goto_15

    :cond_15
    move-object/from16 v29, p25

    :goto_15
    const/high16 v2, 0x2000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_16

    move/from16 v30, v3

    goto :goto_16

    :cond_16
    move/from16 v30, p26

    :goto_16
    const/high16 v2, 0x4000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_17

    move-object/from16 v31, v6

    goto :goto_17

    :cond_17
    move-object/from16 v31, p27

    :goto_17
    const/high16 v2, 0x20000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_18

    move-object/from16 v34, v4

    goto :goto_18

    :cond_18
    move-object/from16 v34, p30

    :goto_18
    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v0, v2

    if-eqz v0, :cond_19

    move-object/from16 v35, v4

    goto :goto_19

    :cond_19
    move-object/from16 v35, p31

    :goto_19
    and-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_1a

    move-object/from16 v37, v5

    goto :goto_1a

    :cond_1a
    move-object/from16 v37, p33

    :goto_1a
    and-int/lit8 v0, v1, 0x2

    if-eqz v0, :cond_1b

    move/from16 v38, v3

    goto :goto_1b

    :cond_1b
    move/from16 v38, p34

    :goto_1b
    and-int/lit8 v0, v1, 0x4

    if-eqz v0, :cond_1c

    move/from16 v39, v3

    goto :goto_1c

    :cond_1c
    move/from16 v39, p35

    :goto_1c
    and-int/lit8 v0, v1, 0x8

    if-eqz v0, :cond_1d

    move-object/from16 v40, v4

    goto :goto_1d

    :cond_1d
    move-object/from16 v40, p36

    :goto_1d
    and-int/lit8 v0, v1, 0x10

    if-eqz v0, :cond_1e

    move-object/from16 v41, v4

    goto :goto_1e

    :cond_1e
    move-object/from16 v41, p37

    :goto_1e
    and-int/lit8 v0, v1, 0x20

    if-eqz v0, :cond_1f

    move-object/from16 v42, v4

    goto :goto_1f

    :cond_1f
    move-object/from16 v42, p38

    :goto_1f
    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_20

    move-object/from16 v44, v5

    goto :goto_20

    :cond_20
    move-object/from16 v44, p40

    :goto_20
    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_21

    move-object/from16 v45, v4

    goto :goto_21

    :cond_21
    move-object/from16 v45, p41

    :goto_21
    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_22

    move-object/from16 v46, v4

    goto :goto_22

    :cond_22
    move-object/from16 v46, p42

    :goto_22
    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_23

    move-object/from16 v47, v4

    goto :goto_23

    :cond_23
    move-object/from16 v47, p43

    :goto_23
    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_24

    move/from16 v48, v3

    :goto_24
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v32, p28

    move/from16 v33, p29

    move-object/from16 v36, p32

    move-object/from16 v43, p39

    goto :goto_25

    :cond_24
    move/from16 v48, p44

    goto :goto_24

    :goto_25
    invoke-direct/range {v4 .. v48}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p45

    move/from16 v2, p46

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p45, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p45, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p45, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p45, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p45, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p45, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_15

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p45, v16

    move/from16 p9, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p45, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_17

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p45, v16

    move/from16 p11, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p45, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_19

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p45, v16

    move/from16 p13, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p45, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p45, v16

    move-object/from16 p15, v1

    if-eqz v16, :cond_1c

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p45, v16

    move/from16 p16, v1

    if-eqz v16, :cond_1d

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p45, v16

    move-object/from16 p17, v1

    if-eqz v16, :cond_1e

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p45, v16

    move-object/from16 p18, v1

    if-eqz v16, :cond_1f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p20, v1

    if-eqz v16, :cond_21

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move/from16 p21, v1

    if-eqz v16, :cond_22

    iget-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    goto :goto_22

    :cond_22
    move/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move/from16 p22, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    and-int/lit16 v2, v2, 0x800

    if-eqz v2, :cond_2b

    iget-boolean v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    move/from16 p45, v2

    :goto_2b
    move/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move/from16 p35, p21

    move/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, v1

    move-object/from16 p16, v3

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, p5

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p22, p8

    move/from16 p23, p9

    move-object/from16 p24, p10

    move/from16 p25, p11

    move-object/from16 p26, p12

    move/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_2c

    :cond_2b
    move/from16 p45, p44

    goto :goto_2b

    :goto_2c
    invoke-virtual/range {p1 .. p45}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final component18()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    return-object v0
.end method

.method public final component19()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    return v0
.end method

.method public final component23()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final component24()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    return v0
.end method

.method public final component25()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    return-object v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    return v0
.end method

.method public final component27()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component31()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    return-object v0
.end method

.method public final component34()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    return v0
.end method

.method public final component35()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    return v0
.end method

.method public final component36()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    return-object v0
.end method

.method public final component37()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    return-object v0
.end method

.method public final component38()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    return-object v0
.end method

.method public final component41()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    return-object v0
.end method

.method public final component42()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    return-object v0
.end method

.method public final component43()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final component44()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "II",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteMentionedUserIds"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersId"

    move-object/from16 v9, p16

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionCounts"

    move-object/from16 v10, p17

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionScores"

    move-object/from16 v11, p18

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionGroups"

    move-object/from16 v12, p19

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "i18n"

    move-object/from16 v13, p23

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v14, p27

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipantsIds"

    move-object/from16 v15, p33

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restrictedVisibility"

    move-object/from16 v1, p40

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v16, p15

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move/from16 v23, p22

    move/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v27, p26

    move-object/from16 v29, p28

    move/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move/from16 v35, p34

    move/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move-object/from16 v41, p40

    move-object/from16 v42, p41

    move-object/from16 v43, p42

    move-object/from16 v44, p43

    move/from16 v45, p44

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    move-object/from16 v24, v13

    move-object/from16 v28, v14

    move-object/from16 v34, v15

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v45}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    if-eq v1, v3, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    if-eq v1, p1, :cond_2d

    return v2

    :cond_2d
    return v0
.end method

.method public final getChannelInfo()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    return-object v0
.end method

.method public final getChannelRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedLocallyAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeletedForMe()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    return v0
.end method

.method public final getDeletedReplyCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getHtml()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMentionedUsersId()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    return-object v0
.end method

.method public final getMessageTextUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getModeration()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    return-object v0
.end method

.method public final getModerationDetails()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinExpires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    return v0
.end method

.method public final getPinnedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getPinnedByUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPollId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final getReactionGroups()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    return-object v0
.end method

.method public final getReminder()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    return-object v0
.end method

.method public final getRemoteMentionedUserIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final getReplyCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    return v0
.end method

.method public final getReplyToId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    return-object v0
.end method

.method public final getShadowed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    return v0
.end method

.method public final getSharedLocation()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    return-object v0
.end method

.method public final getShowInChannel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    return v0
.end method

.method public final getSilent()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    return v0
.end method

.method public final getSkipEnrichUrl()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    return v0
.end method

.method public final getSkipPushNotification()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    return v0
.end method

.method public final getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getThreadParticipantsIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUpdatedLocallyAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    if-nez v2, :cond_12

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_12
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setSkipEnrichUrl(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    return-void
.end method

.method public final setSkipPushNotification(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 47

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->cid:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->userId:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->text:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->html:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->type:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyCount:I

    iget v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedReplyCount:I

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->createdLocallyAt:Ljava/util/Date;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedAt:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->updatedLocallyAt:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedAt:Ljava/util/Date;

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->remoteMentionedUserIds:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->mentionedUsersId:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionCounts:Ljava/util/Map;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionScores:Ljava/util/Map;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reactionGroups:Ljava/util/Map;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->parentId:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->command:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->shadowed:Z

    move/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->i18n:Ljava/util/Map;

    move-object/from16 v24, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->showInChannel:Z

    move/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelInfo:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move-object/from16 v26, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->silent:Z

    move/from16 v27, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->extraData:Ljava/util/Map;

    move-object/from16 v28, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->replyToId:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinned:Z

    move/from16 v30, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedAt:Ljava/util/Date;

    move-object/from16 v31, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinExpires:Ljava/util/Date;

    move-object/from16 v32, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pinnedByUserId:Ljava/lang/String;

    move-object/from16 v33, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->threadParticipantsIds:Ljava/util/List;

    move-object/from16 v34, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipPushNotification:Z

    move/from16 v35, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->skipEnrichUrl:Z

    move/from16 v36, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderationDetails:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-object/from16 v37, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->moderation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-object/from16 v38, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->messageTextUpdatedAt:Ljava/util/Date;

    move-object/from16 v39, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->pollId:Ljava/lang/String;

    move-object/from16 v40, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->restrictedVisibility:Ljava/util/List;

    move-object/from16 v41, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->reminder:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-object/from16 v42, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->sharedLocation:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-object/from16 v43, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->channelRole:Ljava/lang/String;

    move-object/from16 v44, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->deletedForMe:Z

    const-string v0, ", cid="

    move/from16 v45, v15

    const-string v15, ", userId="

    move-object/from16 v46, v13

    const-string v13, "MessageInnerEntity(id="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", text="

    const-string v2, ", html="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", type="

    const-string v2, ", syncStatus="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", replyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deletedReplyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdLocallyAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", updatedLocallyAt="

    invoke-static {v0, v11, v1, v12, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", deletedAt="

    const-string v2, ", remoteMentionedUserIds="

    move-object/from16 v3, v46

    invoke-static {v0, v3, v1, v14, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", mentionedUsersId="

    const-string v2, ", reactionCounts="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", reactionScores="

    const-string v2, ", reactionGroups="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", command="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowed="

    const-string v2, ", i18n="

    move-object/from16 v3, v22

    move/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showInChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", channelInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", silent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", replyToId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pinned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinExpires="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pinnedByUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", threadParticipantsIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", skipPushNotification="

    const-string v2, ", skipEnrichUrl="

    move-object/from16 v3, v34

    move/from16 v4, v35

    invoke-static {v1, v2, v0, v3, v4}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", moderationDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moderation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageTextUpdatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pollId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", restrictedVisibility="

    const-string v2, ", reminder="

    move-object/from16 v3, v40

    move-object/from16 v4, v41

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sharedLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deletedForMe="

    const-string v2, ")"

    move-object/from16 v3, v44

    move/from16 v4, v45

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
