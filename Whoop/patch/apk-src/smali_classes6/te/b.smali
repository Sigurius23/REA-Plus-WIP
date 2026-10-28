.class public final Lte/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lte/d;


# static fields
.field public static final a:Lte/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lte/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lte/b;->a:Lte/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "(empty response)"

    return-object v0
.end method
