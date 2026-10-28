.class final Liq0/d$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/d$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Liq0/d$a$a$a$a;->w:Liq0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Liq0/d$a$a$a$a;->w:Liq0/d;

    invoke-static {p2, p1}, Liq0/d;->f(Liq0/d;Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    invoke-virtual {p0, p1, p2}, Liq0/d$a$a$a$a;->b(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
