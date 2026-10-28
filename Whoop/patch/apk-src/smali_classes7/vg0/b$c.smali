.class final Lvg0/b$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor"
    f = "AiChatFileInteractor.kt"
    l = {
        0x9a
    }
    m = "removeFile"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/b;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/b;",
            "Lq83/d<",
            "-",
            "Lvg0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/b$c;->E:Lvg0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvg0/b$c;->z:Ljava/lang/Object;

    iget p1, p0, Lvg0/b$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvg0/b$c;->F:I

    iget-object p1, p0, Lvg0/b$c;->E:Lvg0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lvg0/b;->h(Lvg0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
