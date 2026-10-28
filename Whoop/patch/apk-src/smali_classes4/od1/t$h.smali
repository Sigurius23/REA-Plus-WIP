.class public abstract Lod1/t$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field private a:Lod1/t$i;

.field private b:I

.field private c:Lod1/t$a;


# direct methods
.method public constructor <init>(Lod1/t$i;ILod1/t$a;Lod1/t$d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p4, "StateKey provided to State constructor must be non-null"

    invoke-static {p1, p4}, Lod1/t$f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Lod1/t$g;->WILDCARD:Lod1/t$g;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, p4, :cond_0

    move p4, v1

    goto :goto_0

    :cond_0
    move p4, v0

    :goto_0
    const-string v2, "A State cannot be created with the WILDCARD key; that key is only used in configuring event transitions"

    invoke-static {p4, v2}, Lod1/t$f;->a(ZLjava/lang/String;)V

    if-ltz p2, :cond_1

    move v0, v1

    :cond_1
    const-string p4, "timeout value provided to State constructor must be non-negative"

    invoke-static {v0, p4}, Lod1/t$f;->a(ZLjava/lang/String;)V

    iput-object p1, p0, Lod1/t$h;->a:Lod1/t$i;

    iput p2, p0, Lod1/t$h;->b:I

    iput-object p3, p0, Lod1/t$h;->c:Lod1/t$a;

    return-void
.end method

.method public static bridge synthetic a(Lod1/t$h;)Lod1/t$a;
    .locals 0

    iget-object p0, p0, Lod1/t$h;->c:Lod1/t$a;

    return-object p0
.end method

.method public static bridge synthetic b(Lod1/t$h;)Lod1/t$i;
    .locals 0

    iget-object p0, p0, Lod1/t$h;->a:Lod1/t$i;

    return-object p0
.end method

.method public static bridge synthetic c(Lod1/t$h;)I
    .locals 0

    iget p0, p0, Lod1/t$h;->b:I

    return p0
.end method


# virtual methods
.method public d()Lod1/t$i;
    .locals 1

    iget-object v0, p0, Lod1/t$h;->a:Lod1/t$i;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lod1/t$h;->a:Lod1/t$i;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
