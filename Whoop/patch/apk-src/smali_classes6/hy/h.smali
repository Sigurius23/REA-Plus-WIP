.class public abstract Lhy/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly00/q1;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ly00/q1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy/h;->a:Ly00/q1;

    iput-object p2, p0, Lhy/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lhy/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lhy/h;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhy/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ly00/q1;
    .locals 1

    iget-object v0, p0, Lhy/h;->a:Ly00/q1;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhy/h;->c:Ljava/lang/String;

    return-object v0
.end method
