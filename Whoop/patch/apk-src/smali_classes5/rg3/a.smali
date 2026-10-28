.class public final Lrg3/a;
.super Lpg3/m;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg3/a;->a:Lcom/google/gson/Gson;

    return-void
.end method

.method public static a(Lcom/google/gson/Gson;)Lrg3/a;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lrg3/a;

    invoke-direct {v0, p0}, Lrg3/a;-><init>(Lcom/google/gson/Gson;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 0

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    iget-object p2, p0, Lrg3/a;->a:Lcom/google/gson/Gson;

    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p1

    new-instance p3, Lrg3/b;

    invoke-direct {p3, p2, p1}, Lrg3/b;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V

    return-object p3
.end method

.method public final responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 0

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    iget-object p2, p0, Lrg3/a;->a:Lcom/google/gson/Gson;

    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p1

    new-instance p3, Lpg3/o;

    invoke-direct {p3, p2, p1}, Lpg3/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method
