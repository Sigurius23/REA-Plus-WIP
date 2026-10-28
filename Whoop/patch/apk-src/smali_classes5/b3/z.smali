.class public final Lb3/z;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Landroidx/compose/ui/platform/AndroidComposeView;

.field public y:I


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lb3/z;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb3/z;->w:Ljava/lang/Object;

    iget p1, p0, Lb3/z;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb3/z;->y:I

    iget-object p1, p0, Lb3/z;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->N(Lc93/m;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
