.class public final Lcz/m0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcz/n0;

.field public y:I


# direct methods
.method public constructor <init>(Lcz/n0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lcz/m0;->x:Lcz/n0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcz/m0;->w:Ljava/lang/Object;

    iget p1, p0, Lcz/m0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcz/m0;->y:I

    iget-object p1, p0, Lcz/m0;->x:Lcz/n0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcz/n0;->l(Lcz/n0;Ly00/o4;Lh20/a;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
