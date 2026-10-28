.class public final Le63/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li63/v;

.field public final b:Lq63/b;

.field public final c:Lz53/h;

.field public final d:Li63/u;

.field public final e:Ljava/lang/Object;

.field public final f:Lq83/j;

.field public final g:Lq63/b;


# direct methods
.method public constructor <init>(Li63/v;Lq63/b;Lz53/h;Li63/u;Ljava/lang/Object;Lq83/j;)V
    .locals 1

    const-string v0, "requestTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le63/g;->a:Li63/v;

    iput-object p2, p0, Le63/g;->b:Lq63/b;

    iput-object p3, p0, Le63/g;->c:Lz53/h;

    iput-object p4, p0, Le63/g;->d:Li63/u;

    iput-object p5, p0, Le63/g;->e:Ljava/lang/Object;

    iput-object p6, p0, Le63/g;->f:Lq83/j;

    const/4 p1, 0x0

    invoke-static {p1}, Lq63/a;->a(Ljava/lang/Long;)Lq63/b;

    move-result-object p1

    iput-object p1, p0, Le63/g;->g:Lq63/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpResponseData=(statusCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le63/g;->a:Li63/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
