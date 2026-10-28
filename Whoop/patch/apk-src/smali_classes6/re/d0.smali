.class public final Lre/d0;
.super Lre/g0;
.source "SourceFile"


# static fields
.field public static final b:Lre/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/d0;->b:Lre/d0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "EMAIL"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Email"

    return-object v0
.end method
