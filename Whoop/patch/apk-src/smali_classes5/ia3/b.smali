.class public final Lia3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lia3/f;


# static fields
.field public static final a:Lia3/b;

.field public static final b:Lia3/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lia3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lia3/b;->a:Lia3/b;

    new-instance v0, Lia3/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lia3/b;->b:Lia3/b;

    return-void
.end method


# virtual methods
.method public a(Lx93/b0;)Lr93/x0;
    .locals 1

    const-string v0, "javaTypeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
