.class public final Lrm/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# instance fields
.field public final w:Llo/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    const/4 v1, 0x0

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Llo/a;->i(Z)V

    new-instance v1, Llo/f;

    invoke-direct {v1, v0}, Llo/f;-><init>(Landroid/util/SparseBooleanArray;)V

    return-void
.end method

.method public constructor <init>(Llo/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/x0;->w:Llo/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lrm/x0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lrm/x0;

    iget-object v0, p0, Lrm/x0;->w:Llo/f;

    iget-object p1, p1, Lrm/x0;->w:Llo/f;

    invoke-virtual {v0, p1}, Llo/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lrm/x0;->w:Llo/f;

    invoke-virtual {v0}, Llo/f;->hashCode()I

    move-result v0

    return v0
.end method
