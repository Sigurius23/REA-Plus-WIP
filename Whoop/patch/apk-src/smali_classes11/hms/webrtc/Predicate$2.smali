.class Lhms/webrtc/Predicate$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/Predicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/Predicate;->and(Lhms/webrtc/Predicate;)Lhms/webrtc/Predicate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhms/webrtc/Predicate<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/Predicate;

.field final synthetic val$other:Lhms/webrtc/Predicate;


# direct methods
.method public constructor <init>(Lhms/webrtc/Predicate;Lhms/webrtc/Predicate;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/Predicate$2;->this$0:Lhms/webrtc/Predicate;

    iput-object p2, p0, Lhms/webrtc/Predicate$2;->val$other:Lhms/webrtc/Predicate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public test(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/Predicate$2;->this$0:Lhms/webrtc/Predicate;

    invoke-interface {v0, p1}, Lhms/webrtc/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/Predicate$2;->val$other:Lhms/webrtc/Predicate;

    invoke-interface {v0, p1}, Lhms/webrtc/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
