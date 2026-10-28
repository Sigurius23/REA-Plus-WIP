.class public final Lza/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:I

.field public final x:Lza/b;


# direct methods
.method public constructor <init>(ILza/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lza/f;->w:I

    iput-object p2, p0, Lza/f;->x:Lza/b;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lza/f;

    iget v0, p0, Lza/f;->w:I

    iget p1, p1, Lza/f;->w:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
