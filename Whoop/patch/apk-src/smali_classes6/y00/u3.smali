.class public final Ly00/u3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ly00/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ly00/v3;
    .locals 3

    new-instance v0, Ly00/v3;

    iget-object v1, p0, Ly00/u3;->a:Ly00/c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Ly00/c;)V
    .locals 0

    iput-object p1, p0, Ly00/u3;->a:Ly00/c;

    return-void
.end method
