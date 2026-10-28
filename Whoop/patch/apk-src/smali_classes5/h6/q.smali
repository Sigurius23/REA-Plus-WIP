.class public final Lh6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/p;


# instance fields
.field public final w:I

.field public x:I

.field public y:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lh6/q;->x:I

    iput v0, p0, Lh6/q;->y:I

    iput p1, p0, Lh6/q;->w:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;IILh6/x;)Z
    .locals 0

    const/4 p1, 0x0

    iget p4, p0, Lh6/q;->w:I

    if-gt p2, p4, :cond_0

    if-ge p4, p3, :cond_0

    iput p2, p0, Lh6/q;->x:I

    iput p3, p0, Lh6/q;->y:I

    return p1

    :cond_0
    if-gt p3, p4, :cond_1

    const/4 p1, 0x1

    :cond_1
    return p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
