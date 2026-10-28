.class public abstract Lf5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/iterable/iterableapi/g1;

.field public static final b:Lcom/iterable/iterableapi/g1;

.field public static final c:Lcom/iterable/iterableapi/g1;

.field public static final d:Lcom/iterable/iterableapi/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/iterable/iterableapi/g1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/iterable/iterableapi/g1;-><init>(Lf5/e;Z)V

    sput-object v0, Lf5/f;->a:Lcom/iterable/iterableapi/g1;

    new-instance v0, Lcom/iterable/iterableapi/g1;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/iterable/iterableapi/g1;-><init>(Lf5/e;Z)V

    sput-object v0, Lf5/f;->b:Lcom/iterable/iterableapi/g1;

    new-instance v0, Lcom/iterable/iterableapi/g1;

    sget-object v1, Lf5/e;->a:Lf5/e;

    invoke-direct {v0, v1, v2}, Lcom/iterable/iterableapi/g1;-><init>(Lf5/e;Z)V

    sput-object v0, Lf5/f;->c:Lcom/iterable/iterableapi/g1;

    new-instance v0, Lcom/iterable/iterableapi/g1;

    invoke-direct {v0, v1, v3}, Lcom/iterable/iterableapi/g1;-><init>(Lf5/e;Z)V

    sput-object v0, Lf5/f;->d:Lcom/iterable/iterableapi/g1;

    return-void
.end method
