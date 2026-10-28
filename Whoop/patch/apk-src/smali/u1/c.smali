.class public Lu1/c;
.super Lm83/f;
.source "SourceFile"

# interfaces
.implements Ls1/d;


# static fields
.field public static final y:Lu1/c;


# instance fields
.field public final w:Lu1/o;

.field public final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu1/c;

    sget-object v1, Lu1/o;->e:Lu1/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu1/c;-><init>(Lu1/o;I)V

    sput-object v0, Lu1/c;->y:Lu1/c;

    return-void
.end method

.method public constructor <init>(Lu1/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/c;->w:Lu1/o;

    iput p2, p0, Lu1/c;->x:I

    return-void
.end method


# virtual methods
.method public a()Lu1/e;
    .locals 1

    new-instance v0, Lu1/e;

    invoke-direct {v0, p0}, Lu1/e;-><init>(Lu1/c;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;Lv1/a;)Lu1/c;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lu1/c;->w:Lu1/o;

    invoke-virtual {v2, p1, v1, p2, v0}, Lu1/o;->u(Ljava/lang/Object;ILjava/lang/Object;I)Lbd3/v;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance p2, Lu1/c;

    iget-object v0, p1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Lu1/o;

    iget v1, p0, Lu1/c;->x:I

    iget p1, p1, Lbd3/v;->x:I

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, Lu1/c;-><init>(Lu1/o;I)V

    return-object p2
.end method

.method public bridge synthetic builder()Ls1/c;
    .locals 1

    invoke-virtual {p0}, Lu1/c;->a()Lu1/e;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lu1/c;->w:Lu1/o;

    invoke-virtual {v2, v1, v0, p1}, Lu1/o;->d(IILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lu1/c;->w:Lu1/o;

    invoke-virtual {v2, v1, v0, p1}, Lu1/o;->g(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
