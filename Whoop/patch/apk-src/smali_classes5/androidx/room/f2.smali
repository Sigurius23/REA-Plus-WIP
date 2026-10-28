.class public final Landroidx/room/f2;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Landroidx/room/i2;

.field public H:I

.field public w:Landroidx/room/j0;

.field public x:Ljava/lang/String;

.field public y:[Ljava/lang/String;

.field public z:I


# direct methods
.method public constructor <init>(Landroidx/room/i2;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/f2;->G:Landroidx/room/i2;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Landroidx/room/f2;->F:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/f2;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/f2;->H:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/room/f2;->G:Landroidx/room/i2;

    invoke-static {v1, p1, v0, p0}, Landroidx/room/i2;->d(Landroidx/room/i2;Landroidx/room/x1;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
