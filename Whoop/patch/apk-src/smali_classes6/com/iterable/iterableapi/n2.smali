.class public final Lcom/iterable/iterableapi/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/c2;


# static fields
.field public static final b:Ljava/util/HashMap;

.field public static final c:Ljava/util/HashMap;


# instance fields
.field public final a:La00/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/n2;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/iterable/iterableapi/n2;->c:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(La00/g;Lcom/iterable/iterableapi/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/n2;->a:La00/g;

    iget-object p1, p2, Lcom/iterable/iterableapi/d2;->F:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
