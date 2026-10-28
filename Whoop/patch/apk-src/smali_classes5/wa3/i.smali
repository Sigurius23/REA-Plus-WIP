.class public final Lwa3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwa3/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwa3/i;-><init>(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwa3/i;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lwa3/i;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lwa3/o;)V
    .locals 3

    new-instance v0, Lwa3/h;

    iget-object v1, p1, Lwa3/o;->a:Lwa3/v;

    iget-object v2, p1, Lwa3/o;->d:Lwa3/n;

    iget v2, v2, Lwa3/n;->w:I

    invoke-direct {v0, v1, v2}, Lwa3/h;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lwa3/i;->a:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
