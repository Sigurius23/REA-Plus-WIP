.class public final Lu1/n;
.super Lm83/a;
.source "SourceFile"


# instance fields
.field public final w:Lu1/c;


# direct methods
.method public constructor <init>(Lu1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/n;->w:Lu1/c;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lu1/n;->w:Lu1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lu1/c;->x:I

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lu1/n;->w:Lu1/c;

    invoke-virtual {v0, p1}, Lm83/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    new-instance v0, Lu1/m;

    iget-object v1, p0, Lu1/n;->w:Lu1/c;

    iget-object v1, v1, Lu1/c;->w:Lu1/o;

    const/16 v2, 0x8

    new-array v3, v2, [Lu1/p;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    new-instance v5, Lu1/r;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lu1/r;-><init>(I)V

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v1, v3}, Lu1/d;-><init>(Lu1/o;[Lu1/p;)V

    return-object v0
.end method
