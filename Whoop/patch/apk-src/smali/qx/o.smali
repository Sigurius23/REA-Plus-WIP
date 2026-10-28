.class public abstract Lqx/o;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# static fields
.field public static final b:Lqx/f;


# instance fields
.field public final a:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqx/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lqx/f;-><init>(I)V

    sput-object v0, Lqx/o;->b:Lqx/f;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lqx/o;->a:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lqx/o;->a:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".collection()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
