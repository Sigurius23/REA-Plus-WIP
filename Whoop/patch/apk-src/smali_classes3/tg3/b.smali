.class public final Ltg3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final x:Lud3/h0;


# instance fields
.field public final w:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Ltg3/b;->x:Lud3/h0;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg3/b;->w:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lqx/y;

    invoke-direct {v1, v0}, Lqx/y;-><init>(Lne3/i;)V

    iget-object v2, p0, Ltg3/b;->w:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    iget-wide v1, v0, Lne3/h;->x:J

    invoke-virtual {v0, v1, v2}, Lne3/h;->m0(J)Lne3/l;

    move-result-object p1

    sget-object v0, Ltg3/b;->x:Lud3/h0;

    invoke-static {v0, p1}, Lud3/v0;->create(Lud3/h0;Lne3/l;)Lud3/v0;

    move-result-object p1

    return-object p1
.end method
