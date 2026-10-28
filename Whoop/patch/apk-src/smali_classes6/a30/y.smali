.class public final La30/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:La30/a0;

.field public F:I

.field public w:La30/a;

.field public x:Z

.field public y:Z

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La30/a0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La30/y;->E:La30/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, La30/y;->z:Ljava/lang/Object;

    iget p1, p0, La30/y;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La30/y;->F:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, La30/y;->E:La30/a0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, La30/a0;->e(La30/a0;Lbc3/i0;Lv00/c0;La30/a;ZZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
