.class public abstract Li63/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li63/d;

.field public static final b:Li63/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li63/d;

    const-string v1, "application"

    const-string v2, "*"

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "atom+xml"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "cbor"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "json"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sput-object v0, Li63/b;->a:Li63/d;

    new-instance v0, Li63/d;

    const-string v2, "hal+json"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "javascript"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "octet-stream"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sput-object v0, Li63/b;->b:Li63/d;

    new-instance v0, Li63/d;

    const-string v2, "font-woff"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "rss+xml"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "xml"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "xml-dtd"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "zip"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "gzip"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "x-www-form-urlencoded"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "pdf"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "vnd.openxmlformats-officedocument.wordprocessingml.document"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "vnd.openxmlformats-officedocument.presentationml.presentation"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "protobuf"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "wasm"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "problem+json"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "problem+xml"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
