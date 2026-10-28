.class public final Lwa3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:I

.field public final x:Lwa3/o0;

.field public final y:Z


# direct methods
.method public constructor <init>(ILwa3/o0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lwa3/n;->w:I

    iput-object p2, p0, Lwa3/n;->x:Lwa3/o0;

    iput-boolean p3, p0, Lwa3/n;->y:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lwa3/n;

    iget v0, p0, Lwa3/n;->w:I

    iget p1, p1, Lwa3/n;->w:I

    sub-int/2addr v0, p1

    return v0
.end method
