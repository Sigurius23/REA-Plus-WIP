.class public abstract Lm1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/e2;

.field public static final b:Ld0/e2;

.field public static final c:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ld0/v;

    const v1, 0x3f19999a    # 0.6f

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ld0/v;-><init>(FFFF)V

    new-instance v1, Ld0/e2;

    sget-object v2, Ld0/b0;->a:Ld0/v;

    const/16 v3, 0x78

    const/4 v4, 0x2

    invoke-direct {v1, v3, v2, v4}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v1, Lm1/w;->a:Ld0/e2;

    new-instance v1, Ld0/e2;

    const/16 v2, 0x96

    invoke-direct {v1, v2, v0, v4}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v1, Lm1/w;->b:Ld0/e2;

    new-instance v1, Ld0/e2;

    invoke-direct {v1, v3, v0, v4}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v1, Lm1/w;->c:Ld0/e2;

    return-void
.end method
