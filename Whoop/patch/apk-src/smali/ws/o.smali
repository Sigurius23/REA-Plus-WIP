.class public final Lws/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lws/o;

.field public static final c:Lws/o;

.field public static final d:Lws/o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lws/o;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lws/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/o;->b:Lws/o;

    new-instance v0, Lws/o;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lws/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/o;->c:Lws/o;

    new-instance v0, Lws/o;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lws/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/o;->d:Lws/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws/o;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lws/o;->a:Ljava/lang/String;

    return-object v0
.end method
