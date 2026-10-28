.class public final La30/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lv00/k0;

.field public F:Lu00/e;

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:La30/a0;

.field public I:I

.field public w:Ljava/lang/Object;

.field public x:Lv00/c0;

.field public y:Lbc3/j0;

.field public z:Lv00/j0;


# direct methods
.method public constructor <init>(La30/a0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/l;->H:La30/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, La30/l;->G:Ljava/lang/Object;

    iget p1, p0, La30/l;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/l;->I:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, La30/l;->H:La30/a0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, La30/a0;->a(La30/a0;La30/k;Lv00/c0;Lbc3/j0;Lv00/j0;Lv00/k0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
