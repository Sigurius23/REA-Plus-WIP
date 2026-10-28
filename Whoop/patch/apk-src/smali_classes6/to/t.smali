.class public final Lto/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lto/a;

.field public final b:Lcq/i;


# direct methods
.method public constructor <init>(Lto/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iput-object v0, p0, Lto/t;->b:Lcq/i;

    iput-object p1, p0, Lto/t;->a:Lto/a;

    return-void
.end method


# virtual methods
.method public final a()Lto/a;
    .locals 1

    iget-object v0, p0, Lto/t;->a:Lto/a;

    return-object v0
.end method

.method public final b()Lcq/i;
    .locals 1

    iget-object v0, p0, Lto/t;->b:Lcq/i;

    return-object v0
.end method
