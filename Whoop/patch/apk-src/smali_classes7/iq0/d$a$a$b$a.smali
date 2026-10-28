.class final Liq0/d$a$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/d$a$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Liq0/d;


# direct methods
.method public constructor <init>(Liq0/d;)V
    .locals 0

    iput-object p1, p0, Liq0/d$a$a$b$a;->w:Liq0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lio/getstream/chat/android/ui/common/state/messages/MessageInput;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageInput;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getSource()Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;

    move-result-object p2

    instance-of v0, p2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;

    if-nez v0, :cond_0

    instance-of p2, p2, Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$CommandSelected;

    if-eqz p2, :cond_1

    :cond_0
    iget-object p2, p0, Liq0/d$a$a$b$a;->w:Liq0/d;

    invoke-static {p2}, Liq0/d;->e(Liq0/d;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageInput;

    invoke-virtual {p0, p1, p2}, Liq0/d$a$a$b$a;->b(Lio/getstream/chat/android/ui/common/state/messages/MessageInput;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
