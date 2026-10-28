.class public interface abstract Ldl/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldl/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldl/k;

    invoke-direct {v0}, Ldl/k;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ldl/k;->a:Z

    new-instance v1, Ldl/m;

    iget-object v0, v0, Ldl/k;->b:Ljava/util/Map;

    invoke-direct {v1, v0}, Ldl/m;-><init>(Ljava/util/Map;)V

    sput-object v1, Ldl/j;->a:Ldl/m;

    return-void
.end method


# virtual methods
.method public abstract getHeaders()Ljava/util/Map;
.end method
