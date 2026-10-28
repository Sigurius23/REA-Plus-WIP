.class public final Lcom/iterable/iterableapi/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Lorg/json/JSONObject;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/iterable/iterableapi/p;->a:Z

    iput p2, p0, Lcom/iterable/iterableapi/p;->b:I

    iput-object p3, p0, Lcom/iterable/iterableapi/p;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/iterable/iterableapi/p;->d:Lorg/json/JSONObject;

    iput-object p5, p0, Lcom/iterable/iterableapi/p;->e:Ljava/lang/String;

    return-void
.end method

.method public static a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;
    .locals 6

    new-instance v0, Lcom/iterable/iterableapi/p;

    const/4 v1, 0x0

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/iterable/iterableapi/p;-><init>(ZILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/iterable/iterableapi/p;
    .locals 6

    new-instance v0, Lcom/iterable/iterableapi/p;

    const/4 v1, 0x1

    const/4 v5, 0x0

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/iterable/iterableapi/p;-><init>(ZILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    return-object v0
.end method
