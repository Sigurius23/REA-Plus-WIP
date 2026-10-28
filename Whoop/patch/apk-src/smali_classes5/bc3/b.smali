.class public final Lbc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/a2;


# static fields
.field public static final w:Lbc3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbc3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbc3/b;->w:Lbc3/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Active"

    return-object v0
.end method
