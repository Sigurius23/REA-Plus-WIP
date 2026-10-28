.class public final Lob/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:I

.field public final x:I

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lob/g;->w:I

    iput p2, p0, Lob/g;->x:I

    iput-object p3, p0, Lob/g;->y:Ljava/lang/String;

    iput-object p4, p0, Lob/g;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lob/g;

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lob/g;->w:I

    iget v1, p1, Lob/g;->w:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lob/g;->x:I

    iget p1, p1, Lob/g;->x:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method
