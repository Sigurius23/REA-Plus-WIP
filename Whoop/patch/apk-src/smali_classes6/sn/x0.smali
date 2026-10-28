.class public final Lsn/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final z:Lsn/x0;


# instance fields
.field public final w:I

.field public final x:Lzr/w0;

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsn/x0;

    const/4 v1, 0x0

    new-array v1, v1, [Lsn/w0;

    invoke-direct {v0, v1}, Lsn/x0;-><init>([Lsn/w0;)V

    sput-object v0, Lsn/x0;->z:Lsn/x0;

    return-void
.end method

.method public varargs constructor <init>([Lsn/w0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzr/g0;->n([Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    iput-object v0, p0, Lsn/x0;->x:Lzr/w0;

    array-length p1, p1

    iput p1, p0, Lsn/x0;->w:I

    const/4 p1, 0x0

    :goto_0
    iget v1, v0, Lzr/w0;->z:I

    if-ge p1, v1, :cond_2

    add-int/lit8 v1, p1, 0x1

    move v2, v1

    :goto_1
    iget v3, v0, Lzr/w0;->z:I

    if-ge v2, v3, :cond_1

    invoke-virtual {v0, p1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsn/w0;

    invoke-virtual {v0, v2}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lsn/w0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, "TrackGroupArray"

    const-string v5, ""

    invoke-static {v4, v5, v3}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(I)Lsn/w0;
    .locals 1

    iget-object v0, p0, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v0, p1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsn/w0;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lsn/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lsn/x0;

    iget v0, p0, Lsn/x0;->w:I

    iget v1, p1, Lsn/x0;->w:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lsn/x0;->x:Lzr/w0;

    iget-object p1, p1, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v0, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lsn/x0;->y:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    iput v0, p0, Lsn/x0;->y:I

    :cond_0
    iget v0, p0, Lsn/x0;->y:I

    return v0
.end method
