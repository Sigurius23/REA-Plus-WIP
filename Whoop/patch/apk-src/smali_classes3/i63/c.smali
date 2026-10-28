.class public abstract Li63/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li63/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li63/d;

    const-string v1, "text"

    const-string v2, "*"

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "plain"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sput-object v0, Li63/c;->a:Li63/d;

    new-instance v0, Li63/d;

    const-string v2, "css"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "csv"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "html"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "javascript"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "vcard"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "xml"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Li63/d;

    const-string v2, "event-stream"

    invoke-direct {v0, v1, v2, v3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static a()Li63/d;
    .locals 1

    sget-object v0, Li63/c;->a:Li63/d;

    return-object v0
.end method
