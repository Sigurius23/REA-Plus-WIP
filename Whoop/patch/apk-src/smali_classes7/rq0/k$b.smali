.class final Lrq0/k$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/k;->V(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel"
    f = "TeamAddMembersViewModel.kt"
    l = {
        0xb4
    }
    m = "loadInvites"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lrq0/k;

.field y:I


# direct methods
.method public constructor <init>(Lrq0/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/k;",
            "Lq83/d<",
            "-",
            "Lrq0/k$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/k$b;->x:Lrq0/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrq0/k$b;->w:Ljava/lang/Object;

    iget p1, p0, Lrq0/k$b;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrq0/k$b;->y:I

    iget-object p1, p0, Lrq0/k$b;->x:Lrq0/k;

    invoke-static {p1, p0}, Lrq0/k;->F(Lrq0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
