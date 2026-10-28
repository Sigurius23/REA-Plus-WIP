.class public final Landroidx/lifecycle/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Landroidx/lifecycle/j;

.field public y:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/i;->x:Landroidx/lifecycle/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/lifecycle/i;->w:Ljava/lang/Object;

    iget p1, p0, Landroidx/lifecycle/i;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/lifecycle/i;->y:I

    iget-object p1, p0, Landroidx/lifecycle/i;->x:Landroidx/lifecycle/j;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/j;->d(Ls83/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
