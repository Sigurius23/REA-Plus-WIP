.class public final Lxr/i;
.super Lxr/g;
.source "SourceFile"


# static fields
.field public static final z:Lxr/i;


# instance fields
.field public final transient y:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxr/i;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, Lxr/i;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lxr/i;->z:Lxr/i;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lxr/i;->y:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lxr/i;->y:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v1
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxr/i;->y:[Ljava/lang/Object;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lrg/j;->b(II)V

    iget-object v0, p0, Lxr/i;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
