.class public final Lb3/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Object;

.field public final c:Lb3/d3;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb3/d3;

    invoke-direct {v0}, Lb3/d3;-><init>()V

    iput-object v0, p0, Lb3/l2;->c:Lb3/d3;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/l2;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lb3/d3;
    .locals 1

    iget-object v0, p0, Lb3/l2;->c:Lb3/d3;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb3/l2;->a:Ljava/lang/String;

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb3/l2;->b:Ljava/lang/Object;

    return-void
.end method
