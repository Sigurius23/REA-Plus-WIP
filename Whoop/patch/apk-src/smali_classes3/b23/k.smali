.class public final Lb23/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lb23/j;

.field public final c:Lb23/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb23/j;Lb23/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb23/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lb23/k;->b:Lb23/j;

    iput-object p3, p0, Lb23/k;->c:Lb23/e;

    return-void
.end method


# virtual methods
.method public final a()Lb23/j;
    .locals 1

    iget-object v0, p0, Lb23/k;->b:Lb23/j;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb23/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lb23/e;
    .locals 1

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    return-object v0
.end method
