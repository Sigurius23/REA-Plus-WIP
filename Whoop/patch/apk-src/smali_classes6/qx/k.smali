.class public final Lqx/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqx/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lqx/k;->b:Ljava/lang/reflect/Field;

    iput-object p3, p0, Lqx/k;->c:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final a(Lcom/squareup/moshi/JsonReader;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqx/k;->c:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lqx/k;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lqx/c0;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqx/k;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lqx/k;->c:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void
.end method
