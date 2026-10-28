.class public final Lmg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lmg/g;

.field public static final b:Lmg/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmg/g;->a:Lmg/g;

    new-instance v0, Lmg/f;

    invoke-direct {v0}, Lmg/a;-><init>()V

    sput-object v0, Lmg/g;->b:Lmg/f;

    return-void
.end method
