.class public final Ld9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ld9/g;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld9/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Ld9/f;->a()Ld9/g;

    move-result-object v0

    sput-object v0, Ld9/g;->d:Ld9/g;

    return-void
.end method

.method public constructor <init>(Ld9/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Ld9/f;->a:Z

    iput-boolean v0, p0, Ld9/g;->a:Z

    iget-boolean v0, p1, Ld9/f;->b:Z

    iput-boolean v0, p0, Ld9/g;->b:Z

    iget-boolean p1, p1, Ld9/f;->c:Z

    iput-boolean p1, p0, Ld9/g;->c:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ld9/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ld9/g;

    iget-boolean v0, p0, Ld9/g;->a:Z

    iget-boolean v1, p1, Ld9/g;->a:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ld9/g;->b:Z

    iget-boolean v1, p1, Ld9/g;->b:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ld9/g;->c:Z

    iget-boolean p1, p1, Ld9/g;->c:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Ld9/g;->a:Z

    shl-int/lit8 v0, v0, 0x2

    iget-boolean v1, p0, Ld9/g;->b:Z

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Ld9/g;->c:Z

    add-int/2addr v0, v1

    return v0
.end method
