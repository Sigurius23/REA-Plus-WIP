.class public final Lxr/j;
.super Lxr/h;
.source "SourceFile"


# static fields
.field public static final F:[Ljava/lang/Object;

.field public static final G:Lxr/j;


# instance fields
.field public final transient E:[Ljava/lang/Object;

.field public final transient z:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lxr/j;->F:[Ljava/lang/Object;

    new-instance v1, Lxr/j;

    invoke-direct {v1, v0, v0}, Lxr/j;-><init>([Ljava/lang/Object;[Ljava/lang/Object;)V

    sput-object v1, Lxr/j;->G:Lxr/j;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lxr/j;->z:[Ljava/lang/Object;

    iput-object p2, p0, Lxr/j;->E:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lxr/j;->z:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v1
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxr/j;->E:[Ljava/lang/Object;

    array-length p1, p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxr/j;->z:[Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lxr/h;->x:Lxr/i;

    if-nez v0, :cond_0

    sget-object v0, Lxr/g;->x:Lxr/e;

    sget-object v0, Lxr/i;->z:Lxr/i;

    iput-object v0, p0, Lxr/h;->x:Lxr/i;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxr/g;->g(I)Lxr/e;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
