.class public final Lcom/amplitude/quickjs/wrapper/JSNull;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/quickjs/wrapper/JSNull;

    invoke-direct {v0}, Lcom/amplitude/quickjs/wrapper/JSNull;-><init>()V

    sput-object v0, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "null"

    return-object v0
.end method
