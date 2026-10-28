.class public final La30/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:La30/a0;

.field public F:I

.field public w:La30/a0;

.field public x:Ly00/u1;

.field public y:Lbc3/i0;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La30/a0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/m;->E:La30/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La30/m;->z:Ljava/lang/Object;

    iget p1, p0, La30/m;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/m;->F:I

    iget-object p1, p0, La30/m;->E:La30/a0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, La30/a0;->c(La30/a0;Lmy/a;Ly00/u1;Lbc3/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
